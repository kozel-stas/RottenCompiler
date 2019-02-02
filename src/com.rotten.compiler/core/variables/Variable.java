package com.rotten.compiler.core.variables;

import java.util.Objects;

// TODO: introduce consts.
public class Variable {

    private final String ID;
    private final VariableType variableType;

    public Variable(String id, VariableType variableType) {
        ID = id;
        this.variableType = variableType;
    }

    public String getID() {
        return ID;
    }

    public VariableType getVariableType() {
        return variableType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Variable) {
            Variable that = (Variable) obj;
            return Objects.equals(ID, that.ID);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
}
