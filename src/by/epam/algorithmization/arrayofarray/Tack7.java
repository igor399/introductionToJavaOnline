package by.epam.algorithmization.arrayofarray;

public class Tack7 {

// 7. Сформировать квадратную матрицу порядка N по правилу:

	public static void main(String[] args) {
		int n = 6;
		int sum = 0;

		double[][] a = new double[n][n];

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = Math.sin((i * i - j * j) / n);

				if (a[i][j] > 0) {
					sum++;
				}
			}
		}
		System.out.println("Cумма положительных эл-ов = " + sum);
	}
}
