package by.epam.algorithmization.arrayofarray;

public class Task15 {

	// 15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

	public static void main(String[] args) {

		int[][] array = new int[10][10];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (int) (Math.random() * 100);
			}
		}

		int maxValue = array[0][0];

		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				
				if (array[i][j] > maxValue) {
					maxValue = array[i][j];
				}
			}

		}
		
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] % 2 != 0) {
					array[i][j] = maxValue;

				}
			}
		}
		for (int i = 0; i < array.length; i++) {

			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
