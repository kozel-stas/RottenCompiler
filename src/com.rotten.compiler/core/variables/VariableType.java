package com.rotten.compiler.core.variables;

import javax.annotation.Nullable;

public enum VariableType {

    INT("int", "int"),;

    private final String displayName;
    private final String outName;

    VariableType(String displayName, String outName) {
        this.displayName = displayName;
        this.outName = outName;
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
}
