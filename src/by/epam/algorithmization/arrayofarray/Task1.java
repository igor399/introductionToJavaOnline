package by.epam.algorithmization.arrayofarray;

public class Task1 {

	/*
	 * 1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый
	 * элемент больше последнего.
	 * 
	 */

	public static void main(String[] args) {

		int[][] a = new int[3][];

		a[0] = new int[] { 9, 0, 12, 7, 1 };
		a[1] = new int[] { 2, 4, 11, 2, 3 };
		a[2] = new int[] { 6, 4, 7, 9, 8 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j += 2) {
				
				if (a[0][j] > a[a.length - 1][j]) {
					
					System.out.print(a[i][j] + " ");
				}

			}
			System.out.println();

		}
		
	}
}
