package com.checkers.checkers;

public class Queen extends Figure {
    private String queen;

    public Queen(String color) {
        super(color);
        queen = super.getFigureColorLetter()+"Q";
    }

    public String getQueen() {
        return queen;
    }

    @Override
    public String toString() {
        return queen;
    }
}
