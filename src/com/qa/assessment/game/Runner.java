package com.qa.assessment.game;

public class Runner {

	public static void main(String[] args)
	{
		Terrain game = new Terrain();
		game.spawnPlayer();
		game.printBoard();
		game.movePlayer(1);
		System.out.println();
		game.printBoard();
		game.movePlayer(3);
		System.out.println();
		game.printBoard();
		game.movePlayer(2);
		System.out.println();
		game.printBoard();
		game.movePlayer(4);
		System.out.println();
		game.printBoard();
	}

}
