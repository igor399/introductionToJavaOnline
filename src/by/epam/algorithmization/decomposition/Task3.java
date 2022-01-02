package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task3 {
//3. Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади
//треугольника.

	public static void main(String[] args) {
		int a;
		double areaHexagon;

		a = enterFromConcole("a >> ");

		areaHexagon = areaHexagon(a);

		System.out.println("Area = " + areaHexagon);
	}

	public static double areaTriangle(int a) {

		return Math.sqrt(3) * Math.pow(a, 2) / 4;
	}

	public static double areaHexagon(int a) {

		return 6 * areaTriangle(a);
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
