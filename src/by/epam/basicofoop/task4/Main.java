package by.epam.basicofoop.task4;

import by.epam.basicofoop.task4.entity.Cave;
import by.epam.basicofoop.task4.entity.ConsoleMenu;

public class Main {

	public static Cave dragonCave = new Cave("Dragon");

	public static void main(String[] args) {
		ConsoleMenu consoleMenu = new ConsoleMenu();

		dragonCave.setNumberOfTreasure(100);

		consoleMenu.startConsoleMenu();

	}
}
