package com.checkers.checkers;

public class None extends Figure {
    private String none;

    public None() {
        none = "__";
    }

    @Override
    public String toString() {
        return none;
    }
}
