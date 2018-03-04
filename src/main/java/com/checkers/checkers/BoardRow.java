package com.checkers.checkers;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Figure> figures = new ArrayList();
    public BoardRow() {
        for (int i=0; i<8; i++) {
            figures.add(new None(Figure.NONE));
        }
    }

    public List<Figure> getFigures() {
        return figures;
    }

    @Override
    public String toString() {
        for (Figure figure: figures) {
            System.out.print("|" + figure);
        }
        return "|\n";
    }
}
