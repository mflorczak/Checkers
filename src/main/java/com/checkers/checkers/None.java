package com.checkers.checkers;

public class None extends Figure {
    private String none;

    public None(String color) {
        super(color);
        none = super.getFigureColorLetter() + "__";
    }

    public String getNone() {
        return none;
    }

    @Override
    public String toString() {
        return none;
    }
}
