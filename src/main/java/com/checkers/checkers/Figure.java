package com.checkers.checkers;

public class Figure {
    private String color;
    public static final String BLACK = "Black";
    public static final String WHITE = "White";
    public static final String NONE = "None";

    public Figure(String color) {
        this.color = color;
    }

    public String getFigureColorLetter() {
        if(color.equals(BLACK)) {
            return "b";
        } else if(color.equals(WHITE)) {
            return "w";
        } else {
            return "";
        }
    }

    public String getColor() {
        return color;
    }
    public String getPause() {
        return "|";
    }
}
