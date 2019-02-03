package com.rotten.compiler.core.variables;

import com.rotten.compiler.gen.RottenLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import javax.annotation.Nullable;

public enum VariableType {

    INT("int", "int", (ctx, visitor) -> {
        return ((RottenLanguageParser.Assign_varContext)ctx).digit_expression().accept(visitor);
    }),
    ELEMENT("element", "Element", (ctx, visitor) -> {
        return ((RottenLanguageParser.Assign_varContext)ctx).intialize_element().accept(visitor);
    }),
    SET("set", "Set", (ctx, visitor) -> {
        return ((RottenLanguageParser.Assign_setContext)ctx).intialize_set().accept(visitor);
    }),;

    private final String displayName;
    private final String outName;
    private final InvocationAction<String> action;

    VariableType(String displayName, String outName, InvocationAction<String> action) {
        this.displayName = displayName;
        this.outName = outName;
        this.action = action;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getOutName() {
        return outName;
    }

    @Nullable
    public static VariableType findByDisplayName(@Nullable String displayName) {
        for (VariableType variableType : VariableType.values()) {
            if (variableType.getDisplayName().equals(displayName)) {
                return variableType;
            }
        }
        return null;
    }

    public String invokeInitLine(ParserRuleContext ctx, ParseTreeVisitor<String> visitor) {
        return action.invoke(ctx, visitor);
    }

    private interface InvocationAction<T> {

        T invoke(ParserRuleContext ctx, ParseTreeVisitor<T> visitor);

    }

}
