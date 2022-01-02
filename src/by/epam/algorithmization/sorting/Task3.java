package by.epam.algorithmization.sorting;

public class Task3 {

//3. Сортировка выбором. Дана последовательность чисел a1<a2<a3...<an.Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 14, 22, 27, 30, 33, 37 };

		for (int i = 0; i < array.length - 1; i++) {
			int maxIndex = i;

			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > array[maxIndex]) {
					maxIndex = j;
				}

				if (maxIndex != i) {
					int tmp = array[i];
					array[i] = array[maxIndex];
					array[maxIndex] = tmp;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
