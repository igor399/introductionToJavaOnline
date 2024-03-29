package by.epam.basic_of_oop.task4.entity;

import java.util.List;

import by.epam.basic_of_oop.task4.action.TreasureAction;

public class Cave {
	private String name;
	private int numberOfTreasure;
	private List<Treasure> treasures;
	private TreasureAction treasureAction;

public Cave(String name) {
	this.name = name;
	this.numberOfTreasure = 0;
	treasureAction = new TreasureAction();
}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfTreasure() {
		return numberOfTreasure;
	}

	public void setNumberOfTreasure(int numberOfTreasure) {
		this.numberOfTreasure = numberOfTreasure;
		this.treasures = treasureAction.fillCaveWithTreasures(numberOfTreasure);
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}
}
