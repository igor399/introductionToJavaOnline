package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task9 {

//		9. Даны числа X, Y, Z, Т — длины сторон четырехугольника. Написать метод(методы) вычисления его площади, 
//		если угол между сторонами длиной X и Y— прямой.

	public static void main(String[] args) {
		double x, y, z, t;
		double p = 0;
		double squareQ = 0;

		x = enterFromConcole("x>>");
		y = enterFromConcole("y>>");
		z = enterFromConcole("z>>");
		t = enterFromConcole("t>>");

		squareQ = squareQuadrangle(p, x, y, z, t);

		System.out.println(squareQ);
	}

	public static double hanlfOfperimetr(double x, double y) {

		return x * y * 0.5;
	}

	public static double squareQuadrangle(double p, double x, double y, double z, double t) {
		double squareQ = 0;

		p = (x + y + z + t) / 2;
		squareQ = Math.sqrt((p - x) * (p - y) * (p - z) * (p - t));

		return squareQ;
	}

	public static int enterFromConcole(String message) {
		try (Scanner sc = new Scanner(System.in)) {
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
}
