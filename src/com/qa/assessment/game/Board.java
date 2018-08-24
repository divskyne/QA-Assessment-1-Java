package com.qa.assessment.game;

import java.util.Random;

public class Board {
	
	private final int playSize = 21;
	private final int playSizeMinusOne = playSize-1;
	private Cell[][] land = new Cell [playSize][playSize];
	int spawnLocation = (int) Math.random();
	
	public Board() {
		initialiseBoard();
	}
	
	public void initialiseBoard() {
		for (int row = 0; row < playSizeMinusOne; row++) {
			for (int column = 0; column < playSizeMinusOne; column++) {
				land[row][column] = new Cell();
			}
		}
	}
	public void spawnPlayer() {
		System.out.println(randomNumberGen());
	}
	
	public int randomNumberGen() {
		Random randomNumber = new Random();
		return randomNumber.nextInt(playSizeMinusOne);
	}
}
