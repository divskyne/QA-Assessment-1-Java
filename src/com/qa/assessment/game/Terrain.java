package com.qa.assessment.game;

import java.util.ArrayList;
import java.util.Random;

public class Terrain {

	private final int playSize = 10;
	private Random randomNumber = new Random();
	private Player player = new Player();
	
	ArrayList<ArrayList<Cell>> terrain = new ArrayList<ArrayList<Cell>>();
	
	public Terrain() {
		initialiseBoard();
	}
	
	private void initialiseBoard() {
		ArrayList<Cell> rows;
		for (int i = 0; i < playSize; i++) {
			rows = new ArrayList<Cell>();
			for (int j = 0; j < playSize; j++) {
				rows.add(new Cell());
			}
			terrain.add(rows);
		}
	}
	
	public void spawnPlayer() {
		int [] playerCoordinate = new int[2];
		playerCoordinate[0] = randomNumberGen();
		playerCoordinate[1] = randomNumberGen();
		
		terrain.get(playerCoordinate[0]).get(playerCoordinate[1]).setContainsplayer(true);
		player.setPlayerCoordinates(playerCoordinate);
	}
	
	public void movePlayer(int direction)
	{
		switch (direction) {
		case 1:
			terrain.get(player.getPlayerCoordinates()[0]).get(player.getPlayerCoordinates()[1]).setContainsplayer(false);
			terrain.get(player.getPlayerCoordinates()[0]+1).get(player.getPlayerCoordinates()[1]).setContainsplayer(true);
			break;
		case 2:
			terrain.get(player.getPlayerCoordinates()[0]).get(player.getPlayerCoordinates()[1]).setContainsplayer(false);
			terrain.get(player.getPlayerCoordinates()[0]-1).get(player.getPlayerCoordinates()[1]).setContainsplayer(true);
			break;
		case 3:
			terrain.get(player.getPlayerCoordinates()[0]).get(player.getPlayerCoordinates()[1]).setContainsplayer(false);
			terrain.get(player.getPlayerCoordinates()[0]).get(player.getPlayerCoordinates()[1]+1).setContainsplayer(true);
			break;
		case 4:
			terrain.get(player.getPlayerCoordinates()[0]).get(player.getPlayerCoordinates()[1]).setContainsplayer(false);
			terrain.get(player.getPlayerCoordinates()[0]+1).get(player.getPlayerCoordinates()[1]-1).setContainsplayer(true);
			break;
		}
	}
	
	public int randomNumberGen() {
		return randomNumber.nextInt(playSize);
	}
	
	public void printBoard() {
		for (ArrayList<Cell> arrayList : terrain) {
			for (Cell cell : arrayList) {
				if(cell.containsplayer())
				{
					System.out.print(" "+"Y"+" ");
				}
				else
				{
					System.out.print(" N ");
				}
			}
			System.out.println();
		}
	}
}
