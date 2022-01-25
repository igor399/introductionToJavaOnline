package by.epam.algorithmization.arrayofarray;

public class Task13 {
	
// 13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.	 

	public static void main(String[] args) {
		int[][] a = new int[5][5];

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

					if (a[j][i] > a[j + 1][i]) {
						sort = false;
						int tmp = a[j][i];
						a[j][i] = a[j + 1][i];
						a[j + 1][i] = tmp;
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

// сортировка по убыванию

		for (int i = 0; i < a.length; i++) {
			boolean sort = false;

			while (!sort) {
				sort = true;

				for (int j = 0; j < a[i].length - 1; j++) {

					if (a[j][i] < a[j + 1][i]) {
						sort = false;
						int tmp = a[j][i];
						a[j][i] = a[j + 1][i];
						a[j + 1][i] = tmp;
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
