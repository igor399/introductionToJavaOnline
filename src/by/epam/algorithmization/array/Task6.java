package by.epam.algorithmization.array;

public class Task6 {

	/*
	 * 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел,
	 * порядковые номера которых являются простыми числами.
	 */

	public static void main(String[] args) {

		double[] a = new double[] { 1.8, 6, 10, 8.7, 4.1, 7.3, 8.1, 9.5, 12, 11.2 };

		double sum = 0;
		boolean smp = false;

		for (int i = 2; i < a.length; i++) {
			
			smp = true;

			for (int j = 2; j < i; j++) {

				if (i % j == 0) {
					
					smp = false;
					continue;
				}
			}

			if (smp == true) {

				System.out.print(a[i] + "  ");
				sum += a[i];
			}
		}
		System.out.print("sum = " + sum );
	}
}