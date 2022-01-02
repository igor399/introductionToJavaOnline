package by.epam.algorithmization.decomposition;

public class Task13 {

//	13. Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
//	Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для
//	решения задачи использовать декомпозицию.

	public static void main(String[] args) {
		int[] array = findValue(100);
		printArray(array);
	}

	public static int[] findValue(int n) {
		int[] array = new int[2 * n - 4];

		for (int i = n, j = 0; i < 2 * n; i++, j = j + 2) {

			if (i + 2 < 2 * n) {
				array[j] = i;
				array[j + 1] = i + 2;
			}
		}
		return array;
	}

	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i += 2) {
			
			if (i < array.length) {
				System.out.println(array[i] + " - " + array[i + 1]);
			}
		}
	}
}