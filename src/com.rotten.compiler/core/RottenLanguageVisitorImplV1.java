package com.rotten.compiler.core;

import com.google.common.base.Preconditions;
import com.rotten.compiler.core.methods.Method;
import com.rotten.compiler.core.methods.MethodType;
import com.rotten.compiler.core.variables.Variable;
import com.rotten.compiler.core.variables.VariableType;
import com.rotten.compiler.gen.RottenLanguageParser;
import com.rotten.compiler.gen.RottenLanguageVisitor;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collections;
import java.util.List;

public class RottenLanguageVisitorImplV1 implements RottenLanguageVisitor<String> {

    private final RottenLanguageParserV1 parserV1;
    private final VariableAndMethodRegister register = new VariableAndMethodRegister();

    public RottenLanguageVisitorImplV1(RottenLanguageParserV1 parserV1) {
        this.parserV1 = parserV1;
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
        StringBuilder out = new StringBuilder(CompilerFields.BEGIN);
        List<RottenLanguageParser.StatementContext> list = ctx.statement();
        for (int i = 0; i < list.size(); i++) {
            out.append(list.get(i).accept(this));
        }
        out.append(CompilerFields.END);
        register.registerVisibilityAreaEnded();
        return out.toString();
    }

    @Override
    public String visitStatement(RottenLanguageParser.StatementContext ctx) {
        Statement statement = Statement.findStatement(ctx);
        Preconditions.checkNotNull(statement);
        return statement.invoke(ctx, this);
    }

    @Override
    public String visitExpression(RottenLanguageParser.ExpressionContext ctx) {
        return null;
    }

    @Override
    public String visitDigit_expression(RottenLanguageParser.Digit_expressionContext ctx) {
        validateDigitExpression(ctx);
        return concatDigitExpression(ctx);
    }

    private String concatDigitExpression(RottenLanguageParser.Digit_expressionContext ctx) {
        StringBuilder out = new StringBuilder();
        List<Token> tokens = parserV1.getTokens(ctx.start, ctx.stop);
        for (int i = 0; i < tokens.size(); i++) {
            out.append(tokens.get(i).getText());
        }
        return out.toString();
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
    public String visitAssign_int(RottenLanguageParser.Assign_intContext ctx) {
        String out = VariableType.INT.getDisplayName() + " " + ctx.ID() + CompilerFields.ASSIGN + ctx.digit_expression().accept(this) + CompilerFields.SEPARATOR;
        register.registerVariable(new Variable(ctx.ID().toString(), VariableType.INT));
        return out;
    }

    @Override
    public String visitOperations(RottenLanguageParser.OperationsContext ctx) {
        Variable variable = register.getVariable(ctx.ID().toString());
        if (variable == null || variable.getVariableType() != VariableType.INT) {
            throw new UnsupportedOperationException();
        }
        validateDigitExpression(ctx.digit_expression());
        return variable.getID() + CompilerFields.ASSIGN + concatDigitExpression(ctx.digit_expression()) + CompilerFields.SEPARATOR;
    }

    @Override
    public String visitPrint_int(RottenLanguageParser.Print_intContext ctx) {
        return String.format(CompilerFields.SOUT, ctx.digit_expression().accept(this)) + CompilerFields.SEPARATOR;
    }

    @Override
    public String visitGlobal_program(RottenLanguageParser.Global_programContext ctx) {
        register.registerMethod(new Method(CompilerFields.MAIN_PROGRAM, MethodType.RETURN_OPTIONAL, Collections.emptyList()));
        return ctx.program().accept(this);
    }

    @Override
    public String visit(ParseTree parseTree) {
        return parseTree.accept(this);
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
