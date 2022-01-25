package by.epam.algorithmization.arrayofarray;

public class Task9 {

	/*
	 * 9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом
	 * столбце. Определить, какой столбец содержит максимальную сумму.
	 */

	public static void main(String[] args) {
		int[][] a = new int[3][];

		a[0] = new int[] { 9, 0, 12, 7, 1 };
		a[1] = new int[] { 2, 4, 11, 2, 3 };
		a[2] = new int[] { 6, 4, 7, 9, 8 };

		int maxValueNmb = 0;

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {

				if (j >= maxValueNmb) {
					maxValueNmb = j + 1;
				}
			}
		}

		int[] sum = new int[maxValueNmb];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++) {
				sum[j] += a[i][j];
			}
		}

		int valueOfsumax = sum[0];

		for (int i = 0; i < sum.length; i++) {

			if (valueOfsumax < sum[i]) {
				valueOfsumax = sum[i];
				maxValueNmb = i;
			}
		}
		
		for (int i = 0; i < sum.length; i++) {
			System.out.print(sum[i] + "  ");
		}
		System.out.println("№ столбца с макс. суммой = " + maxValueNmb);
	}
}
