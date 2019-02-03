package com.rotten.compiler.core;

import com.google.common.base.Preconditions;
import com.rotten.compiler.core.methods.Method;
import com.rotten.compiler.core.methods.MethodType;
import com.rotten.compiler.core.variables.Variable;
import com.rotten.compiler.core.variables.VariableType;
import com.rotten.compiler.gen.RottenLanguageParser;
import com.rotten.compiler.gen.RottenLanguageVisitor;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RottenLanguageVisitorImplV1 implements RottenLanguageVisitor<String> {

    private final RottenLanguageParserV1 parserV1;
    private final VariableAndMethodRegister register = new VariableAndMethodRegister();
    private final String name;

    public RottenLanguageVisitorImplV1(RottenLanguageParserV1 parserV1, String name) {
        this.parserV1 = parserV1;
        this.name = name;
    }

    @Override
    public String visitProgram(RottenLanguageParser.ProgramContext ctx) {
        register.registerMethodInvocation();
        String out = CompilerFields.MAIN_METHOD + ctx.block().accept(this);
        register.registerMethodInvocationEnded();
        return out;
    }

    @Override
    public String visitBlock(RottenLanguageParser.BlockContext ctx) {
        register.registerNew​​VisibilityArea();
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN).append(invokeAllStatementsForBlock(ctx.statement()));
        out.append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    private StringBuilder invokeAllStatementsForBlock(List<RottenLanguageParser.StatementContext> list) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            out.append(list.get(i).accept(this));
        }
        return out;
    }

    @Override
    public String visitStatement(RottenLanguageParser.StatementContext ctx) {
        Statement statement = Statement.findStatement(ctx);
        Preconditions.checkNotNull(statement);
        return statement.invoke(ctx, this);
    }

    @Override
    public String visitDigit_expression(RottenLanguageParser.Digit_expressionContext ctx) {
        validateDigitExpression(ctx);
        return concatExpr(ctx) + CompilerFields.SEPARATOR;
    }

    @Override
    public String visitIntialize_set(RottenLanguageParser.Intialize_setContext ctx) {
        String ID = ((RottenLanguageParser.Assign_setContext) ctx.parent).ID().getText();
        return VariableType.SET.getOutName() + " " + ID + CompilerFields.ASSIGN + CompilerFields.NEW_SET + CompilerFields.SEPARATOR + handleSetInitialization(ctx.ID(), ID);
    }

    private String handleSetInitialization(List<TerminalNode> list, String rootID) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            Variable variable = Preconditions.checkNotNull(register.getVariable(list.get(i).getText()));
            if (variable.getVariableType() != VariableType.ELEMENT) {
                throw new UnsupportedOperationException();
            }
            out.append(rootID).append(CompilerFields.DELIMITER).append(String.format(CompilerFields.ADD_NEW_ELEMENT, variable.getID())).append(CompilerFields.SEPARATOR);
        }
        return out.toString();
    }

    @Override
    public String visitIntialize_element(RottenLanguageParser.Intialize_elementContext ctx) {
        return String.format(CompilerFields.NEW_ELEMENT, ctx.STRING()) + CompilerFields.SEPARATOR;
    }

    @Override
    public String visitAssign_var_method_invocation(RottenLanguageParser.Assign_var_method_invocationContext ctx) {
        Variable variable = new Variable(ctx.ID().getText(), Preconditions.checkNotNull(VariableType.findByDisplayName(ctx.type().getText())));
        Preconditions.checkState(register.registerVariable(variable));
        Method method = Preconditions.checkNotNull(register.getRegisteredMethod(ctx.method_invokation().ID().getText()));
        if (method.getMethodType() == MethodType.RETURN_OPTIONAL || method.getMethodType().getReturnedType() != variable.getVariableType()) {
            throw new UnsupportedOperationException();
        }
        return variable.getVariableType().getOutName() + " " + variable.getID() + CompilerFields.ASSIGN + ctx.method_invokation().accept(this);
    }

    private void validateDigitExpression(RottenLanguageParser.Digit_expressionContext ctx) {
        if (ctx.ID() != null) {
            Variable variable = register.getVariable(ctx.ID().toString());
            if (variable == null || variable.getVariableType() != VariableType.INT) {
                throw new UnsupportedOperationException();
            }
        }
        List<RottenLanguageParser.Digit_expressionContext> expr = ctx.digit_expression();
        for (int i = 0; i < expr.size(); i++) {
            validateDigitExpression(expr.get(i));
        }
    }

    @Override
    public String visitAssign_var(RottenLanguageParser.Assign_varContext ctx) {
        VariableType variableType = Preconditions.checkNotNull(VariableType.findByDisplayName(ctx.type_1().getText()));
        String out = variableType.getOutName() + " " + ctx.ID() + CompilerFields.ASSIGN + variableType.invokeInitLine(ctx, this);
        Preconditions.checkState(register.registerVariable(new Variable(ctx.ID().toString(), variableType)));
        return out;
    }

    @Override
    public String visitAssign_set(RottenLanguageParser.Assign_setContext ctx) {
        StringBuilder out = new StringBuilder();
        Operation operation = Operation.findOperation(ctx.intialize_set());
        if (operation == null) {
            out.append(VariableType.SET.invokeInitLine(ctx, this));
            Preconditions.checkState(register.registerVariable(new Variable(ctx.ID().toString(), VariableType.SET)));
        } else {
            for (int i = 1; i < 2; i++) {
                Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.intialize_set().ID(i).getText()));
                if (variable.getVariableType() != VariableType.SET) {
                    throw new UnsupportedOperationException();
                }
            }
            out.append(VariableType.SET.getOutName()).append(" ").append(ctx.ID()).append(CompilerFields.ASSIGN);
            out.append(String.format(operation.getOverrideSet(), ctx.intialize_set().ID(0), ctx.intialize_set().ID(1))).append(CompilerFields.SEPARATOR);
            Preconditions.checkState(register.registerVariable(new Variable(ctx.ID().toString(), VariableType.SET)));
        }
        return out.toString();
    }

    @Override
    public String visitPrint(RottenLanguageParser.PrintContext ctx) {
        if (ctx.ID() != null) {
            Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID().getText()));
            return String.format(CompilerFields.SOUT, variable.getID()) + CompilerFields.SEPARATOR;
        } else {
            return String.format(CompilerFields.SOUT, ctx.STRING() == null ? ctx.NUMBER() : ctx.STRING()) + CompilerFields.SEPARATOR;
        }
    }

    @Override
    public String visitOperations(RottenLanguageParser.OperationsContext ctx) {
        Variable variable = register.getVariable(ctx.ID().toString());
        if (variable == null || variable.getVariableType() != VariableType.INT) {
            throw new UnsupportedOperationException();
        }
        validateDigitExpression(ctx.digit_expression());
        return variable.getID() + CompilerFields.ASSIGN + concatExpr(ctx.digit_expression()) + CompilerFields.SEPARATOR;
    }

    @Override
    //TODO rework.
    public String visitOperarions_with_set(RottenLanguageParser.Operarions_with_setContext ctx) {
        Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID(0).getText()));
        Variable el = Preconditions.checkNotNull(register.getVariable(ctx.ID(1).getText()));
        if (variable.getVariableType() != VariableType.SET || el.getVariableType() != VariableType.ELEMENT) {
            throw new UnsupportedOperationException();
        }
        if (ctx.ADD() == null) {
            return variable.getID() + CompilerFields.DELIMITER + String.format(CompilerFields.REMOVE_NEW_ELEMENT, el.getID()) + CompilerFields.SEPARATOR;
        } else {
            return variable.getID() + CompilerFields.DELIMITER + String.format(CompilerFields.REMOVE_NEW_ELEMENT, el.getID()) + CompilerFields.SEPARATOR;
        }
    }

    @Override
    public String visitSimple_compare(RottenLanguageParser.Simple_compareContext ctx) {
        List<RottenLanguageParser.Digit_expressionContext> dctx = ctx.digit_expression();
        validateDigitExpression(dctx.get(0));
        validateDigitExpression(dctx.get(1));
        return concatExpr(ctx);
    }

    private String concatExpr(ParserRuleContext ctx) {
        StringBuilder out = new StringBuilder();
        List<Token> tokens = parserV1.getTokens(ctx.start, ctx.stop);
        for (int i = 0; i < tokens.size(); i++) {
            out.append(tokens.get(i).getText());
        }
        return out.toString();
    }

    @Override
    public String visitHard_compare(RottenLanguageParser.Hard_compareContext ctx) {
        return ctx.NEGATION().getText() + ctx.O_BRACKET().getText() + visitSimple_compare(ctx.simple_compare()) + ctx.C_BRACKET().getText();
    }

    @Override
    public String visitWhile_cicle(RottenLanguageParser.While_cicleContext ctx) {
        String out = String.format(CompilerFields.WHILE, handlerCompare(ctx.hard_compare(), ctx.simple_compare()));
        out += ctx.block().accept(this);
        return out;
    }

    private String handlerCompare(RottenLanguageParser.Hard_compareContext htx, RottenLanguageParser.Simple_compareContext stx) {
        return stx == null ? htx.accept(this) : stx.accept(this);
    }

    @Override
    public String visitIf_then(RottenLanguageParser.If_thenContext ctx) {
        return String.format(CompilerFields.IF_ELSE, handlerCompare(ctx.hard_compare(), ctx.simple_compare()), ctx.block(0).accept(this), ctx.block(1).accept(this));
    }

    @Override
    public String visitType(RottenLanguageParser.TypeContext ctx) {
        VariableType variableType = VariableType.findByDisplayName(ctx.getText());
        return Preconditions.checkNotNull(variableType).getOutName();
    }

    @Override
    public String visitType_1(RottenLanguageParser.Type_1Context ctx) {
        VariableType variableType = VariableType.findByDisplayName(ctx.getText());
        return Preconditions.checkNotNull(variableType).getOutName();
    }

    @Override
    public String visitSignature(RottenLanguageParser.SignatureContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append(CompilerFields.OPEN_BRACKET);
        for (int i = 0; i < ctx.ID().size(); i++) {
            VariableType variableType = VariableType.findByDisplayName(ctx.type(i).getText());
            Preconditions.checkNotNull(variableType);
            register.registerVariable(new Variable(ctx.ID(i).getText(), variableType));
            builder.append(ctx.type(i).accept(this)).append(" ").append(ctx.ID(i));
            if (i != ctx.ID().size() - 1) {
                builder.append(CompilerFields.COMMA);
            }
        }
        builder.append(CompilerFields.CLOSE_BRACKET);
        return builder.toString();
    }

    @Override
    public String visitSubprogram_return(RottenLanguageParser.Subprogram_returnContext ctx) {
        Method method = register.getRegisteredMethod(ctx.ID().toString());
        if (method == null || method.getMethodType() == MethodType.RETURN_OPTIONAL) {
            throw new UnsupportedOperationException();
        }
        register.registerMethodInvocation();
        //NPE checked before.
        String s = CompilerFields.SUB_METHOD + method.getMethodType().getReturnedType().getOutName()
                + " " + ctx.ID() + ctx.signature().accept(this) + ctx.block_return().accept(this);
        register.registerMethodInvocationEnded();
        return s;
    }

    @Override
    public String visitSubprogram_non_return(RottenLanguageParser.Subprogram_non_returnContext ctx) {
        Method method = register.getRegisteredMethod(ctx.ID().toString());
        if (method == null || method.getMethodType() != MethodType.RETURN_OPTIONAL) {
            throw new UnsupportedOperationException();
        }
        register.registerMethodInvocation();
        String s = CompilerFields.SUB_METHOD + CompilerFields.VOID + " " + ctx.ID() + handleSignature(ctx.signature());
        s += ctx.block_non_return() == null ? ctx.block().accept(this) : ctx.block_non_return().accept(this);
        register.registerMethodInvocationEnded();
        return s;
    }

    private String handleSignature(RottenLanguageParser.SignatureContext ctx) {
        return ctx == null ? CompilerFields.OPEN_BRACKET + CompilerFields.CLOSE_BRACKET : ctx.accept(this);
    }

    @Override
    public String visitBlock_return(RottenLanguageParser.Block_returnContext ctx) {
        register.registerNew​​VisibilityArea();
        Method method = Preconditions.checkNotNull(register.getRegisteredMethod(((RottenLanguageParser.Subprogram_returnContext) ctx.parent).ID().getText()));
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN).append(invokeAllStatementsForBlock(ctx.statement()));
        out.append(CompilerFields.RETURN);
        Variable variable = Preconditions.checkNotNull(register.getVariable(ctx.ID().getText()));
        if (variable.getVariableType() != method.getMethodType().getReturnedType()) {
            throw new UnsupportedOperationException();
        }
        out.append(" ").append(variable.getID()).append(CompilerFields.SEPARATOR).append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitBlock_non_return(RottenLanguageParser.Block_non_returnContext ctx) {
        register.registerNew​​VisibilityArea();
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN).append(invokeAllStatementsForBlock(ctx.statement()));
        out.append(CompilerFields.RETURN);
        out.append(CompilerFields.SEPARATOR);
        out.append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitSignature_method_invokation(RottenLanguageParser.Signature_method_invokationContext ctx) {
        StringBuilder builder = new StringBuilder();
        builder.append(CompilerFields.OPEN_BRACKET);
        Method method = register.getRegisteredMethod(((RottenLanguageParser.Method_invokationContext) ctx.parent).ID().getText());
        Preconditions.checkNotNull(method);
        if (method.getArguments().size() != ctx.ID().size()) {
            throw new UnsupportedOperationException();
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            Variable variable = register.getVariable(ctx.ID(i).getText());
            if (variable == null || method.getArguments().get(i) != variable.getVariableType()) {
                throw new UnsupportedOperationException();
            }
            builder.append(variable.getID());
        }
        return builder.append(CompilerFields.CLOSE_BRACKET).toString();
    }

    @Override
    public String visitMethod_invokation(RottenLanguageParser.Method_invokationContext ctx) {
        Method method = register.getRegisteredMethod(ctx.ID().toString());
        if (method == null) {
            throw new UnsupportedOperationException();
        }
        return method.getID() + " " + handleSignatureOfInvocation(ctx) + CompilerFields.SEPARATOR;
    }

    private String handleSignatureOfInvocation(RottenLanguageParser.Method_invokationContext ctx) {
        if (ctx.signature_method_invokation() == null) {
            Method method = Preconditions.checkNotNull(register.getRegisteredMethod(ctx.ID().getText()));
            if (method.getArguments().size() != 0) {
                throw new UnsupportedOperationException();
            }
            return CompilerFields.OPEN_BRACKET + CompilerFields.CLOSE_BRACKET;
        }
        return ctx.signature_method_invokation().accept(this);
    }

    @Override
    public String visitGlobal_program(RottenLanguageParser.Global_programContext ctx) {
        StringBuilder out = new StringBuilder();
        register.registerMethod(new Method(CompilerFields.MAIN_PROGRAM, MethodType.RETURN_OPTIONAL, Collections.emptyList()));
        List<RottenLanguageParser.Subprogram_non_returnContext> non_returnContexts = ctx.subprogram_non_return();
        List<RottenLanguageParser.Subprogram_returnContext> returnContexts = ctx.subprogram_return();
        for (RottenLanguageParser.Subprogram_returnContext ct : returnContexts) {
            VariableType variableType = Preconditions.checkNotNull(VariableType.findByDisplayName(ct.type().getText()));
            register.registerMethod(new Method(ct.ID().toString(), Preconditions.checkNotNull(MethodType.findByReturnedType(variableType)), collectMethodArguments(ct.signature())));
            out.append(ct.accept(this));
        }
        for (RottenLanguageParser.Subprogram_non_returnContext ct : non_returnContexts) {
            register.registerMethod(new Method(ct.ID().toString(), MethodType.RETURN_OPTIONAL, collectMethodArguments(ct.signature())));
            out.append(ct.accept(this));
        }
        out.append(ctx.program().accept(this));
        return out.toString();
    }

    private List<VariableType> collectMethodArguments(RottenLanguageParser.SignatureContext ctx) {
        List<VariableType> variableTypes = new ArrayList<>();
        if (ctx == null) {
            return Collections.emptyList();
        }
        for (int i = 0; i < ctx.ID().size(); i++) {
            VariableType variableType = VariableType.findByDisplayName(ctx.type(i).getText());
            variableTypes.add(Preconditions.checkNotNull(variableType));
        }
        return variableTypes;
    }

    @Override
    public String visit(ParseTree parseTree) {
        String out = parseTree.accept(this);
        System.out.println(out);
        return String.format(CompilerFields.STATIC_CONTENT, name, out);
    }

    @Override
    public String visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public String visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public String visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
