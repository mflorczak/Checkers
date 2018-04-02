package com.checkers.checkers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class CheckersApplication {

	public static void main(String[] args) {
		//SpringApplication.run(CheckersApplication.class, args);
		Board board = new Board();
		Board.setFigures();
		System.out.println(board);


		board.move(0,6,-1,5);
		System.out.println(board);

//		board.move(1,5,0,4);
//		System.out.println(board);
//
//		board.move(6,6,7,5);
//		System.out.println(board);
//
//		board.move(7,5,6,6);
//		System.out.println(board);
//
//
//		board.move(1,1,0,2);
//		System.out.println(board);
//
//		board.move(0,2,1,3);
//		System.out.println(board);
//
//		board.move(1,3,0,4);
//		System.out.println(board);
	}
}
