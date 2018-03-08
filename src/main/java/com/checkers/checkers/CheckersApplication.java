package com.checkers.checkers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CheckersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckersApplication.class, args);

		Board board = new Board();

		for(int i=0; i<=7; i+=2) {
			board.setFigure(0, i, new Pawn(Figure.BLACK));
			board.setFigure(6, i, new Pawn(Figure.WHITE));
		}

		for(int i=1; i<=7; i+=2) {
			board.setFigure(1, i, new Pawn(Figure.BLACK));
			board.setFigure(7, i, new Pawn(Figure.WHITE));
		}
		System.out.println(board);

		board.move(0,6,1,5);
		System.out.println(board);
		board.move(1,5,0,4);
		System.out.println(board);

		board.move(6,6,7,5);
		System.out.println(board);

		board.move(7,5,6,6);
		System.out.println(board);

		board.move(0,4,1,2);
		System.out.println(board);

		board.move(1,1,0,2);
		System.out.println(board);
	}
}
