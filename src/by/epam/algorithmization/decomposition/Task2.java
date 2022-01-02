package by.epam.algorithmization.decomposition;

import java.util.Scanner;

//https://github.com/enhorse/java-interview/blob/master/core.md#java-core

public class Task2 {

	// 2. Написать метод(методы) для нахождения наибольшего общего делителя четырех
	// натуральных чисел.

	public static void main(String[] args) {

		int firstNumber;
		int secondNumber;
		int thirdNumber;
		int fourNumber;
		int nod;

		firstNumber = enterFromConcole("1st >> ");
		secondNumber = enterFromConcole("2nd >> ");
		thirdNumber = enterFromConcole("3rd >> ");
		fourNumber = enterFromConcole("4rd >> ");

		nod = nod(firstNumber, secondNumber, thirdNumber, fourNumber);
		System.out.println("наибольший общий делитель: " + nod);
	}

	public static int nod(int firstNumber, int secondNumber, int thirdNumber, int fourNumber) {
		int tmpNod;
		tmpNod = nod(firstNumber, secondNumber);
		tmpNod = nod(tmpNod, thirdNumber);
		tmpNod = nod(tmpNod, fourNumber);

		return tmpNod;
	}

	public static int nod(int firstNumber, int secondNumber) {

		while (firstNumber != 0 && secondNumber != 0) {

			if (firstNumber > secondNumber) {
				firstNumber = firstNumber % secondNumber;

			} else {
				secondNumber = secondNumber % firstNumber;
			}
		}
		return firstNumber + secondNumber;
	}

	public static int enterFromConcole(String message) {

		Scanner sc = new Scanner(System.in);
		int value;

		System.out.print(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		
		return value;
	}
}
