package com.qa.assessment.game;

public class Cell {
	
	private boolean containsplayer;
	private final boolean containsPOI;
	
	public Cell() {
		this.containsPOI = false;
	}
	
	public Cell(boolean POIstatus) {
		this.containsPOI = POIstatus;
	}
	
	public boolean containsplayer() {
		return containsplayer;
	}

	public void setContainsplayer(boolean containsplayer) {
		this.containsplayer = containsplayer;
	}

	public boolean containsPOI() {
		return containsPOI;
	}

}
