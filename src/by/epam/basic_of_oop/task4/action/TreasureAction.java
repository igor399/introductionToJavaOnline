package by.epam.basic_of_oop.task4.action;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.epam.basic_of_oop.task4.Main;
import by.epam.basic_of_oop.task4.entity.*;

public class TreasureAction {

	void showAllTreasure() {
		int id = 1;
		
		for (Treasure element : Main.dragonCave.getTreasures()) {
			System.out.println(String.format("%3d %-100s", id++, element));
		}
		System.out.println();
	}

	void chooseMostExpensive() {
		int maxPrice = 0;
		Treasure treasure = null;
		
		for (Treasure element : Main.dragonCave.getTreasures()) {
			
			if (element.getValue() > maxPrice) {
				maxPrice = element.getValue();
				treasure = element;
			}
		}
		System.out.println(treasure);
	}

	void selectForGivenAmount(int[] valueRange) {
		List<Treasure> treasures = new ArrayList<>();
		
		for (Treasure element : Main.dragonCave.getTreasures()) {
			
			if (element.getValue() >= valueRange[0] && element.getValue() <= valueRange[1]) {
				treasures.add(element);
			}
		}

		if (treasures.size() == 0) {
			System.out.println("нет такой опции");
			return;
		}
		int id = 1;
		
		for (Treasure element : treasures) {
			System.out.println(String.format("%3d %100s", id++, element));
		}
		System.out.println();
	}

	public List<Treasure> fillCaveWithTreasures(int numberOfTreasure) {
		List<Treasure> treasures = new ArrayList<>();
		
		try {
			FileReader file = new FileReader("D:\\Workspace\\JOnlineTraning\\introductionToJavaOnline\\src\\by\\epam\\basic_of_oop\\task4\\data\\treasures_list.txt");
			try (Scanner scanner = new Scanner(file)) {
				
				while (scanner.hasNextLine() && numberOfTreasure-- > 0) {
					String[] treasureLine = scanner.nextLine().split(" - ");
					String treasureType = treasureLine[0];
					String treasureName = treasureLine[1];
					int treasureValue = Integer.parseInt(treasureLine[2]);
					String descriptionOfTreasure = treasureLine[3];
					
					switch (treasureType) {
					case "Porcelain":
						treasures.add(new Porcelain(treasureName, treasureValue, descriptionOfTreasure));
						break;
						
					case "Necklace":
						treasures.add(new Necklace(treasureName, treasureValue, descriptionOfTreasure));
						break;
						
					case "Combat Weapon":
						treasures.add(new CombatWeapon(treasureName, treasureValue, descriptionOfTreasure));
						break;
						
					case "Coin":
						treasures.add(new Coin(treasureName, treasureValue, descriptionOfTreasure));
						break;
						
					case "Gem":
						treasures.add(new Gem(treasureName, treasureValue, descriptionOfTreasure));
					}
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("Treasure information file not found.");
		}
		
		return treasures;
	}
}
