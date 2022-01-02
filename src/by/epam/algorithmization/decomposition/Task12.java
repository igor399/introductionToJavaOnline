package by.epam.algorithmization.decomposition;

import java.util.Arrays;

public class Task12 {

//	12. Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
//	элементами которого являются числа, сумма цифр которых равна К и которые не большее N.

	public static void main(String[] args) {
		int k = 6;
		int n = 500;

		System.out.println(Arrays.toString(array(k, n)));
	}

	public static int[] array(int k, int n) {

		int[] array;
		int count = 0;
		int tmp;
		int sum;
		int j;

		for (int i = 0; i <= n; i++) {
			tmp = i;
			sum = 0;

			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}

			if (sum == k) {
				count++;
			}
		}

		array = new int[count];
		j = 0;

		for (int i = 0; i <= n; i++) {

			tmp = i;
			sum = 0;

			while (tmp > 0) {
				sum += tmp % 10;
				tmp /= 10;
			}

			if (sum == k) {
				array[j] = i;
				j++;
			}
		}

		return array;
	}
}
