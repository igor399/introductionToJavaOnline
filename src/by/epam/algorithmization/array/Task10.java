package by.epam.algorithmization.array;

public class Task10 {

	/*
	 * 10. Дан целочисленный массив с количеством элементов п. Сжать массив,
	 * выбросив из него каждый второй элемент (освободившиеся элементы заполнить
	 * нулями). Примечание. Дополнительный массив не использовать.
	 */

	public static void main(String[] args) {

		int[] a = new int[] { 12, 46, 45, 11, 13, 67, 99, 0, 3, 2 };
		printa(a);

	}

	public static void printa(int[] a) {

		for (int i = 1; i < a.length; i += 2) {

			a[i] = 0;
		}
		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + "  ");
		}
	}
}
