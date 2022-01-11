package by.epam.algorithmization.arrayofarray;

public class Task12 {

	/*
	 * 12. Отсортировать строки матрицы по возрастанию и убыванию значений
	 * элементов.
	 */

	public static void main(String[] args) {

		int[][] a = new int[7][8];
		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 100);
			}
		}

		// сортировка по возрастанию

		for (int i = 0; i < a.length; i++) {
			boolean sort = false;

			while (!sort) {
				sort = true;

				for (int j = 0; j < a[i].length - 1; j++) {

					if (a[i][j] > a[i][j + 1]) {
						sort = false;
						int tmp = a[i][j];
						a[i][j] = a[i][j + 1];
						a[i][j + 1] = tmp;
					}
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

// сортировка по возрастанию

		for (int i = 0; i < a.length; i++) {
			boolean sort = false;

			while (!sort) {
				sort = true;

				for (int j = 0; j < a[i].length - 1; j++) {

					if (a[i][j] < a[i][j + 1]) {
						sort = false;
						int tmp = a[i][j];
						a[i][j] = a[i][j + 1];
						a[i][j + 1] = tmp;

					}
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
