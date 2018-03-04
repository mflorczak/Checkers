package com.checkers.checkers;

import java.util.ArrayList;
import java.util.List;

public class BoardRow {
    private List<Figure> figures = new ArrayList();
    private Figure figure;
    public BoardRow() {
        figures.add(new None());
        figures.add(new None());
        figures.add(new None());
        figures.add(new None());
        figures.add(new None());
        figures.add(new None());
        figures.add(new None());
        figures.add(new None());
    }
    public void setFigure(int col, Figure figure) {
        figures.set(col,figure);
    }

    @Override
    public String toString() {
        for (Figure figure: figures) {
            System.out.print("|" + figure);
        }
        return "|\n";
    }
}
