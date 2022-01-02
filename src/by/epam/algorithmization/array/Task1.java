package by.epam.algorithmization.array;

public class Task1 {

//1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.	

	public static void main(String[] args) {

		int k = 2;

		int sum = 0;

		int[] a = new int[] { 2, 6, 12, 23, 17 };

		for (int i = 0; i < a.length; i++) {

			if (a[i] % k == 0) {
				sum += a[i];
			}
		}
		System.out.println(sum + " ");
		System.out.println();

	}
}
