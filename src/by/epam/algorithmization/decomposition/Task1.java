package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task1 {

//	1. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//	натуральных чисел: НОК (А,Б) = А*В/НОД (А,В).

	public static void main(String[] args) {
		int a;
		int b;
		int nod;
		int nok;

		a = enterFromConcole("a >> ");
		b = enterFromConcole("b >> ");

		nod = nod(a, b);
		nok = nok(a, b);

		System.out.println("наибольший общий делитель: " + nod);
		System.out.println("наименьшее общее кратное: " + nok);
	}

	public static int nod(int a, int b) {

		while (a != 0 && b != 0) {

			if (a > b) {
				a = a % b;

			} else {
				b = b % a;
			}
		}
		return a + b;
	}

	public static int nok(int a, int b) {
		int nod = nod(a, b);

		return (a * b) / nod;
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
