package by.epam.algorithmization.array;

public class Task5 {

	/*
	  5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
которых аi > i.
	 */

	public static void main(String[] args) {

		int[] a = new int[] { 0, 2, 5, 6, 10, 0, 12 };

		printarray(a);
	}

	public static void printarray(int [] a) {

		for (int i = 0; i < a.length; i++) {

			if (a[i] > i) {

				System.out.print(a[i] + "  ");

			}
		}
	}
}
