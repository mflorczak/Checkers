package com.checkers.checkers;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private Figure figure;
    private BoardRow boardRow;
    private List<BoardRow> rows = new ArrayList<>();

    public Board(){
        rows.add(new BoardRow());
        rows.add(new BoardRow());
        rows.add(new BoardRow());
        rows.add(new BoardRow());
        rows.add(new BoardRow());
        rows.add(new BoardRow());
        rows.add(new BoardRow());
        rows.add(new BoardRow());
    }

    public Figure getFigure(int row, int col) {
        return figure;
    }

    public void setFigure(int row, int col, Figure figure) {
        rows.set(row,boardRow.setFigure(col,figure));
    }

    @Override
    public String toString() {
        for (BoardRow row: rows ) {
            System.out.print(row);
        }
        return "";
    }
}
