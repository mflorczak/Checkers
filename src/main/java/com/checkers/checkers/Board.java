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
    }

    public void move(int x1, int y1, int x2, int y2) {
        if((y1 > y2 || y1 < y2) && (rows.get(y1).getFigures().get(x1).getColor() == Figure.WHITE)
                &&(rows.get(y2).getFigures().get(x2).getColor() == Figure.NONE)
                && (x2 <8&& y2 <8)) {
            rows.get(y2).getFigures().set(x2, new Pawn(Figure.WHITE));
            rows.get(y1).getFigures().set(x1, new None(Figure.NONE));
        } else if((y1 > y2 || y1 < y2) && (rows.get(y1).getFigures().get(x1).getColor() == Figure.BLACK)
                &&(rows.get(y2).getFigures().get(x2).getColor() == Figure.NONE)
                && (x2 <8&& y2 <8)) {
                rows.get(y2).getFigures().set(x2, new Pawn(Figure.BLACK));
                rows.get(y1).getFigures().set(x1, new None(Figure.NONE));
        } else {
            System.out.println("Wrong move!!!");
        }
    }

    @Override
    public String toString() {
        String s = "";
        int numberRow = 9;
        char letter = 'A';
        System.out.print(" __");
        for(int i=0; i<8; i++) {
            System.out.print("|" + letter++ +" ");
        }
        System.out.println("|");

        for (BoardRow row: rows ) {
            numberRow--;
            s += numberRow + row.toString();
        }
        return s;
    }
}
