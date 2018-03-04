package com.checkers.checkers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckersApplication {

	public static void main(String[] args) {
		SpringApplication.run(CheckersApplication.class, args);

		Board board = new Board();
		//board.setFigure(1,1,new Queen());
		System.out.print(board);
	}
}
