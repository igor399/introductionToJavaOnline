package by.epam.algorithmization.sorting;

public class Task6 {

//6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1, то продвигаются
//на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

	public static void main(String[] args) {
		int[] array = new int[] { 13, 11, 0, 11, 41, 1, 99, 18, 81, 64 };
		int halfArray = array.length / 2;

		while (halfArray > 0) {

			for (int i = 0; i < (array.length - halfArray); i++) {
				int j = i;

				while (j >= 0 && array[j] > array[j + halfArray]) {
					int tmp = array[j];
					array[j] = array[j + halfArray];
					array[j + halfArray] = tmp;
					j--;
				}
			}
			halfArray = halfArray / 2;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
