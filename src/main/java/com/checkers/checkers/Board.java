package com.checkers.checkers;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<BoardRow> rows = new ArrayList<>();

    public Board(){
        for (int i=0; i<8; i++) {
            rows.add(new BoardRow());
        }
    }

    public Figure getFigure(int row, int col) {
        return null;
    }

    public List<BoardRow> getRows() {
        return rows;
    }

    public void setFigure(int row, int col, Figure figure) {
        rows.get(row).getFigures().set(col, figure);
        //rows.get(row).getFigures().remove(col+1);
    }

    @Override
    public String toString() {
        for (BoardRow row: rows ) {
            System.out.print(row);
        }
        return "";
    }
}
