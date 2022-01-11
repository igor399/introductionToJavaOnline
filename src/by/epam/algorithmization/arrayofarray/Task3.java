package by.epam.algorithmization.arrayofarray;

public class Task3 {
	// 3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

	public static void main(String[] args) {

		int k = 1; // string
		int p = 3; // collum

		int[][] a = new int[3][];

		a[0] = new int[] { 9, 0, 12, 7, 1 };
		a[1] = new int[] { 2, 4, 11, 2, 3 };
		a[2] = new int[] { 6, 4, 7, 9, 8 };

		for (int i = 0; i < a[k].length; i++) {

			System.out.print(a[k][i] + "  ");

		}
		System.out.println("  ");

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i][p] + "  ");
		}
	}
}
