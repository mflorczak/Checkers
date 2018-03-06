package com.checkers.checkers;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Figure> figures = new ArrayList();
    private int rowNumber =8 ;
    public BoardRow() {
        for (int i=0; i<8; i++) {
            figures.add(new None(Figure.NONE));
        }
        rowNumber -= 1;
    }

    public List<Figure> getFigures() {
        return figures;
    }

    @Override
    public String toString() {
        String s = "";
        for (Figure figure: figures) {
            s +=  "|" + figure.toString();
        }
        rowNumber -=1;
        return rowNumber + "|" + "  " + s + "|\n";
    }
}
