package by.epam.basic_of_oop.task4.entity;

import by.epam.basic_of_oop.task4.action.ConsoleMenuAction;

public class ConsoleMenu {
	private ConsoleMenuAction consoleMenuAction = new ConsoleMenuAction();

	public void startConsoleMenu() {
		int choice;
		boolean isStopped = false;
		consoleMenuAction.printOptions();

		while (!isStopped) {
			System.out.println("введите номер действия: \n Ваш выбор: ");
			choice = consoleMenuAction.makeChoice();
			isStopped = consoleMenuAction.processingOperation(choice);
		}
	}
}
