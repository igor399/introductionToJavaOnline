package by.epam.algorithmization.arrayofarray;

public class Task10 {

	// 10. Найти положительные элементы главной диагонали квадратной матрицы.

	public static void main(String[] args) {

		int[][] a = new int[3][];

		a[0] = new int[] { 1, 0, 12 };
		a[1] = new int[] { 2, -5, 11 };
		a[2] = new int[] { 6, 4, 7 };

		for (int i = 0; i < a.length; i++) {

			if (a[i][i] > 0) {

			System.out.print(a[i][i] + "  ");
			}
		}
	}
}
