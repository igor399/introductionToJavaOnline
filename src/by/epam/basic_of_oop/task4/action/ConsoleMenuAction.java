package by.epam.basic_of_oop.task4.action;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleMenuAction {
	private Scanner scanner = new Scanner(System.in);

	public void printOptions() {
		String menuText = "что будем делать с богатсвом? \n" 
	            + "1 - показать все сокровища; \n"
				+ "2 - выбрать самое дорогое по стоимости сокровище; \n" 
				+ "3 - выбрать сокровище на заданную сумму; \n"
				+ "4 - закрыть приложение";
		System.out.println(menuText);
	}

	public int makeChoice() {
		int choice;

		try {
			choice = Integer.parseInt(scanner.nextLine());
			
			if (choice > 4 || choice < 1) {
				System.out.println("введите от 1 до 4");
				printOptions();
			} else {
				
				return choice;
			}
		} catch (NumberFormatException e) {
			System.out.println("неверный ввод");
			printOptions();
		}
		
		return -1;
	}

	public boolean processingOperation(int choice) {
		TreasureAction treasureAction = new TreasureAction();
		
		switch (choice){
		case 1:
			System.out.println("весь список сокровищ: ");
			treasureAction.showAllTreasure();
			break;
			
		case 2:
			System.out.println("самое дорогое по стоимости сокровище: ");
			treasureAction.chooseMostExpensive();
			break;
			
		case 3:
			int[] valueRange = new int[2];
			boolean isValid = false;
			
			while(!isValid) {
				System.out.println("введите диапазон золотых для выбора");
				@SuppressWarnings("resource")
				Scanner scanner = new Scanner(System.in);
				try {
					valueRange[0] = scanner.nextInt();
					valueRange[1] = scanner.nextInt();
					isValid = true;
				}catch (InputMismatchException e ) {
					System.out.println("невверный ввод");
				}
			}
			System.out.println(String.format("сокровища стоимостью от %d до %d:", valueRange[0], valueRange[1]));
			treasureAction.selectForGivenAmount(valueRange);
			break;
			
		case 4:
			System.out.println("приложение зыкрыто");
			
			return true;
		}
		
		return false;		
	}
}
