package by.epam.algorithmization.decomposition;

import java.util.Scanner;

public class Task10 {

//	10. Дано натуральное число N. Написать метод(методы) 
//  для формирования массива, элементами которого являются цифры числа N.

	public static void main(String[] args) {
		int n;		
		n = enterFromConcole("n >>> ");
		
		int[] arrayFromValue = arrayFromValue(n);
		
		for (int i = 0; i < arrayFromValue.length; i++) {
			System.out.print(arrayFromValue[i] + " ");
		}
	}

	public static int[] arrayFromValue(int n) {
		int arrSize = 0;
		int[] arr;
		int tmp = n;

		while (tmp != 0) {
			arrSize++;
			tmp /= 10;
		}
		arr = new int[arrSize];

		while (n != 0) {
			arr[--arrSize] = n % 10;
			n /= 10;
		}
		return arr;
	}

	public static int enterFromConcole(String message) {
		try (Scanner sc = new Scanner(System.in)) {
			int value;
			System.out.print(message);

			while (!sc.hasNextInt()) {
				sc.next();
				System.out.print(message);
			}
			value = sc.nextInt();
			return value;
		}
	}
}
