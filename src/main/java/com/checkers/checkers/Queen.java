package com.checkers.checkers;

public class Queen extends Figure {
    private String queen;

    public Queen() {
        queen = "Q";
    }

    @Override
    public String toString() {
        return queen;
    }
}
