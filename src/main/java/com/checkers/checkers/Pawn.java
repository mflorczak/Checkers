package com.checkers.checkers;

public class Pawn extends Figure {
    private String pawn;

    public Pawn(String color) {
        super(color);
        pawn = super.getFigureColorLetter() + "P";
    }

    public String getPawn() {
        return pawn;
    }

    @Override
    public String toString() {
        return pawn;
    }




}
