package com.rotten.compiler.core.methods;

import com.rotten.compiler.core.variables.VariableType;

import javax.annotation.Nullable;

public enum MethodType {

    RETURN_INT(VariableType.INT),
    RETURN_OPTIONAL(null),;

    @Nullable
    private final VariableType returnedType;

    MethodType(VariableType returnedType) {
        this.returnedType = returnedType;
    }

    @Nullable
    public VariableType getReturnedType() {
        return returnedType;
    }

    public boolean isOptional() {
        return this == RETURN_OPTIONAL;
    }

}