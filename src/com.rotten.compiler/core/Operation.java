package com.rotten.compiler.core;

import com.rotten.compiler.gen.RottenLanguageParser;
import org.antlr.v4.runtime.ParserRuleContext;

import javax.annotation.Nullable;

public enum Operation {

    PLUS(RottenLanguageParser.MULTIPLY, "Set.union(%s,%s)"),
    MINUS(RottenLanguageParser.MINUS, "Set.diff(%s,%s)"),
    DIVIDE(RottenLanguageParser.DIVIDE, "Set.simDiff(%s,%s)"),
    MULTIPLY(RottenLanguageParser.MULTIPLY, "Set.intersection(%s,%s)"),;

    private final int type;
    private final String overrideSet;

    Operation(int type, String overrideSet) {
        this.type = type;
        this.overrideSet = overrideSet;
    }

    @Nullable
    public static Operation findOperation(ParserRuleContext ctx) {
        for (Operation operation : Operation.values()) {
            if (ctx.getToken(operation.type, 0) != null) {
                return operation;
            }
        }
        return null;
    }

    public String getOverrideSet() {
        return overrideSet;
    }

}
