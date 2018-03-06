package com.checkers.checkers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CheckersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckersApplication.class, args);
		char letter ='A';

		Board board = new Board();
		System.out.print("    ");
		for(int i=0; i<8; i++) {
			System.out.print(" " + letter++ +" ");
		}
		System.out.println("\n    -------------------------");

		for(int i=0; i<=7; i+=2) {
			board.setFigure(0, i, new Pawn(Figure.BLACK));
			board.setFigure(6, i, new Pawn(Figure.WHITE));
		}

		for(int i=1; i<=7; i+=2) {
			board.setFigure(1, i, new Pawn(Figure.BLACK));
			board.setFigure(7, i, new Pawn(Figure.WHITE));
		}
		System.out.print(board);
	}
}
