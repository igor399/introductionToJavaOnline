package by.epam.algorithmization.decomposition;

public class Task8 {

//	8. Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//	Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.

	public static void main(String[] args) {
		int[] d = newarray();
		int[] sumOfThree = sumOfThree(d);

		for (int i = 0; i < sumOfThree.length; i++) {
			System.out.print(sumOfThree[i] + "  ");
		}
	}

	public static int[] newarray() {
		int n = 9;
		int[] d = new int[n];

		for (int i = 0; i < d.length; i++) {
			d[i] = (int) (Math.random() * 100);
		}

		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + "  ");
		}
		System.out.println();

		return d;
	}

	public static int[] sumOfThree(int[] d) {
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;

		for (int i = 0; i <= 2; i++) {
			sum1 += d[i];
		}

		for (int i = 3; i <= 5; i++) {
			sum2 += d[i];
		}

		for (int i = 6; i <= 8; i++) {
			sum3 += d[i];
		}
		return new int[] { sum1, sum2, sum3 };
	}
}
