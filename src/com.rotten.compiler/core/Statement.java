package com.rotten.compiler.core;

import com.rotten.compiler.gen.RottenLanguageParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import javax.annotation.Nullable;

public enum Statement {

    ASSIGN_INT(RottenLanguageParser.Assign_intContext.class, (ctx, visitor) -> {
        return ctx.assign_int().accept(visitor);
    }),
    PRINT_INT(RottenLanguageParser.Print_intContext.class, (ctx, visitor) -> {
        return ctx.print_int().accept(visitor);
    }),
    PRINT_STRING(RottenLanguageParser.Print_stringContext.class, (ctx, visitor) -> {
        return ctx.print_string().accept(visitor);
    }),
    OPERATION_INT(RottenLanguageParser.OperationsContext.class, (ctx, visitor) -> {
        return ctx.operations().accept(visitor);
    }),
    WHILE_CICLE(RottenLanguageParser.While_cicleContext.class, (ctx, visitor) -> {
        return ctx.while_cicle().accept(visitor);
    }),
    IF_THEN(RottenLanguageParser.If_thenContext.class, (ctx, visitor) -> {
        return ctx.if_then().accept(visitor);
    }),;


    private final Class clazz;
    private final InvocationAction<String> action;

    Statement(Class clazz, InvocationAction<String> action) {
        this.clazz = clazz;
        this.action = action;
    }

    @Nullable
    public static Statement findStatement(RottenLanguageParser.StatementContext ctx) {
        for (Statement statement : Statement.values()) {
            if (ctx.getRuleContext(statement.clazz, 0) != null) {
                return statement;
            }
        }
        return null;
    }

    public String invoke(RottenLanguageParser.StatementContext ctx, ParseTreeVisitor<String> visitor) {
        return action.invoke(ctx, visitor);
    }

    private interface InvocationAction<T> {

        T invoke(RottenLanguageParser.StatementContext ctx, ParseTreeVisitor<T> visitor);

    }

}
