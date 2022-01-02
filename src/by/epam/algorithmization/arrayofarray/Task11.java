package by.epam.algorithmization.arrayofarray;

public class Task11 {

	/*
	 * 11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран
	 * саму матрицу и номера строк, в которых число 5 встречается три и более раз.
	 */

	public static void main(String[] args) {
		array();
	}

	public static void array() {
		int[][] a = new int[10][20];

		for (int i = 0; i < a.length; i++) {
			int fivevalue = 0;

			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int) (Math.random() * 16);

				if (a[i][j] == 5) {
					fivevalue++;
				}

				System.out.print(a[i][j] + " ");
			}
			System.out.println();

			if (fivevalue >= 3) {
				
				System.out.println("строка № " + i);
			}			
		}
	}
}
