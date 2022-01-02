package by.epam.algorithmization.sorting;

public class Task4 {

//4. Сортировка обменами. Дана последовательность чисел a1<a2<a3...<an .Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1, то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

	public static void main(String[] args) {

		int[] array = new int[] { 12, 1, 0, 7, 9, 11, 99, 15, 13, 77 };
		int sumOfSwap = 0;
		boolean ssort = false;

		while (!ssort) {
			ssort = true;

			for (int i = 0; i < array.length - 1; i++) {

				if (array[i] < array[i + 1]) {
					ssort = false;					
					int tmp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = tmp;					
					sumOfSwap++;
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.print("кол-во перестановок = " + sumOfSwap);
	}
}
