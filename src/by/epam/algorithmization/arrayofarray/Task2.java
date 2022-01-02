package by.epam.algorithmization.arrayofarray;

public class Task2 {
//	
//	  2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
//	  
//	 

	public static void main(String[] args) {

		int[][] a = new int[3][];

		a[0] = new int[] { 9, 0, 12 };
		a[1] = new int[] { 2, -3, 11 };
		a[2] = new int[] { 6, 4, 7 };

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; i == j; j++) {

				continue;
			}
			System.out.println(a[i][i] + " ");
		}
	}
}
