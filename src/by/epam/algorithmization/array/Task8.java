package by.epam.algorithmization.array;

public class Task8 {
	/*
	 * 8. Дана последовательность целых чисел a1,a2,a2...an. Образовать новую
	 * последовательность, выбросив из исходной те члены, которые равны
	 * min(a1,a2,a2...an) .
	 */
	public static void main(String[] args) {

		int[] b = new int[] { 7, 3, 6, 1, 4, 2, 1, 1, 7, 2, 10 };

		printb(b);
	}

	public static void printb(int[] b) {

		int min = b[0];
		
		int sumOfmin = 0;

		for (int i = 0; i < b.length; i++) {

			if (b[i] < min) {

				min = b[i];
			
			    
			}
			if (b[i] == min) {
				
				sumOfmin++;
			}
		}

		int[] c = new int[b.length - sumOfmin];

		for (int i = 0, j = 0; i < b.length; i++) {

			if (b[i] != min) {

				c[j] = b[i];

				j++;
			}
		}
		for (int j = 0; j < c.length; j++) {
			System.out.print(c[j] + "  ");
		}
	}
}
