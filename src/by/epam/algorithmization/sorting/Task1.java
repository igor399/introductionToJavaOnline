package by.epam.algorithmization.sorting;

public class Task1 {

//1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

	public static void main(String[] args) {

		int[] firstArray = new int[] { 14, 28, 31, 11, 0, 7, 59, 15 };
		int[] secondArray = new int[] { 7, 9, 13, 51, 33, 8, 12, 11 };
		int k = 3;
		int[] endArray = new int[firstArray.length + secondArray.length];

		for (int i = 0; i < firstArray.length; i++) {

			if (i == k) {
				endArray[i] = firstArray[i];

				for (int j = 0; j < secondArray.length; j++) {
					endArray[i + j + 1] = secondArray[j];
				}

			}else if (i < k) {
				endArray[i] = firstArray[i];

			}else {
				endArray[i + secondArray.length] = firstArray[i];
			}
		}

		for (int i = 0; i < endArray.length; i++) {
			System.out.print(endArray[i] + " ");
		}
	}
}
