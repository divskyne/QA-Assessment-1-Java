package com.qa.assessment.game;

import java.util.ArrayList;

public class Board2 {

	private final int playSize = 10;
	private final int playSizeMinusOne = playSize-1;
	
	ArrayList<ArrayList<Cell>> board = new ArrayList<ArrayList<Cell>>();
	
	public Board2() {
		ArrayList<Cell> rows;
		//rows.add(new Cell());
		for (int i = 0; i < playSize; i++) {
			rows = new ArrayList<Cell>();
			for (int j = 0; j < playSize; j++) {
				rows.add(new Cell());
			}
			board.add(rows);
		}
		board.get(7).get(3).setContainsplayer(true);
	}
	public void printBoard() {
		for (ArrayList<Cell> arrayList : board) {
			for (Cell cell : arrayList) {
				if(cell.containsplayer())
				{
					System.out.println(cell.toString());
				}
				else
				{
					//System.out.println("No");
				}
			}
		}
	}
}
