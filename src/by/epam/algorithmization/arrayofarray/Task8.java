package by.epam.algorithmization.arrayofarray;

import java.util.Scanner;

public class Task8 {

	/*
	 * 8. В числовой матрице поменять местами два любых столбца, т. е. все элементы
	 * одного столбца поставить на соответствующие им позиции другого, а его
	 * элементы второго переместить в первый. Номера столбцов вводит пользователь с
	 * клавиатуры.
	 */

	public static void main(String[] args) {

		int firstcollumn = 0;
		int seccollumn = 0;
		int chngValue;

		Scanner sc = new Scanner(System.in);
		System.out.print("enter 1st collumn >> ");
		firstcollumn = sc.nextInt();

		System.out.print("enter 2nd collumn >> ");
		seccollumn = sc.nextInt();

		int[][] a = new int[3][];

		a[0] = new int[] { 9, 0, 12, 7, 1 };
		a[1] = new int[] { 2, 4, 11, 2, 3 };
		a[2] = new int[] { 6, 4, 7, 9, 8 };

		for (int i = 0; i < a.length; i++) {
			chngValue = a[i][firstcollumn - 1];
			a[i][firstcollumn - 1] = a[i][seccollumn - 1];
			a[i][seccollumn - 1] = chngValue;

			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}