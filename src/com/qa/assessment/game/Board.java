package com.qa.assessment.game;

import java.util.ArrayList;
import java.util.Random;

public class Board {
	
	private final int playSize = 10;
	private final int playSizeMinusOne = playSize-1;
	//private ArrayList<Cell[]> land = new ArrayList<Cell[]>();
	//ArrayList<Cell>[][] map = new ArrayList[10][10];

	//private ArrayList<Cell> rows = new ArrayList<Cell>();
	
	private ArrayList<ArrayList<Cell>> land = new ArrayList<ArrayList<Cell>>();
	private int lastKnownPlayerRow = 0;
	private int lastKnownPlayerColumn = 0;
	
	public Board() {
		initialiseBoard();
	}
	
/*	public void initialiseBoard() {
		Cell[] cell = new Cell[playSize];
		for (int i = 0; i < playSize; i++) {
			for (int j = 0; j < playSize; j++) {
				//rows.add(new Cell());
				cell[j] = new Cell();
			}
			land.add(cell);
		}
	}*/
	
/*	public void initialiseBoard() {
		ArrayList<Cell> cells = new ArrayList<Cell>();
		cells.add(new Cell());
		for (int i = 0; i < playSize; i++) {
			for (int j = 0; j < playSize; j++) {
				map[i][j] = cells;
				//map[i][j].add(new Cell());
			}
		}
	}*/

	private void initialiseBoard() {
		ArrayList<Cell> cells = new ArrayList<Cell>();
		for (int i = 0; i < playSize; i++) {
			for (int j = 0; j < playSize; j++) {
				//land.get(i).get(j);
				cells.add(new Cell());
				//land.set(j, new Cell());
			}
			//land.add(cells);
		}
	}

	public void spawnPlayer() {
		int row = randomNumberGen();
		int column = randomNumberGen();
		
		System.out.println(row + "..." + column);
		//map[row][column].add(new Cell());
		//map[row][column].get(column);
		
		//map[row][column].get(map[row][column].indexOf(map[row][column])).setContainsplayer(true);
		//System.out.println(map[row][column].size());
		//System.out.println(map[row][column].toString());
		
		land.get(row).get(column).setContainsplayer(true);
		
		this.setKnownLastPlayerRow(row);
		this.setKnownLastPlayerColumn(column);
	}
	
	public void printBoard()
	{
		for (ArrayList<Cell> arrayList : land) {
			//System.out.println(land.toString());
			for (Cell cell : arrayList) {
					if (cell.containsplayer())
					{
						System.out.println(cell.containsplayer());
					}
					else 
					{
						System.out.print(cell.containsplayer());
					}
//				if(cell.containsplayer())
//				{
//					System.out.println();
//					System.out.println(cell.containsplayer());
//				}
			}
		}
	}
	
	/**
	 row -> north + south
	 column -> west east
	 **/
	public void movePlayer()
	{
		
	}
	
	public int randomNumberGen() {
		Random randomNumber = new Random();
		return randomNumber.nextInt(playSizeMinusOne);
	}
	public void playDirection(String direction) {
		switch(direction)
		{
			case "north":
			{
				movePlayer();
			}
			case "south":
			{
				
			}
			case "east":
			{
				
			}
			case "west":
			{
				
			}
		}
	}

	public int getKnownLastPlayerRow() {
		return lastKnownPlayerRow;
	}

	public void setKnownLastPlayerRow(int lastPlayerRow) {
		this.lastKnownPlayerRow = lastPlayerRow;
	}

	public int getKnownLastPlayerColumn() {
		return lastKnownPlayerColumn;
	}

	public void setKnownLastPlayerColumn(int lastPlayerColumn) {
		this.lastKnownPlayerColumn = lastPlayerColumn;
	}
}
