package by.epam.algorithmization.array;

public class Task2 {
	/* 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
	числом. Подсчитать количество замен.		
*/

	public static void main(String[] args) {
	
	int[] b = new int[] {1, 3, 6, 1, 4, 2, 1, 1, 7, 2, 10};
	
	printb(b);
	}
	
	public static void printb(int[] b) {

		int z = 3;
		int sum2 = 0;

		for (int i = 0; i < b.length; i++) {

			if (b[i] > z) {

				b[i] += z;

				sum2++;
			}
		}
		System.out.println(sum2);

		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + "  ");
		}
	}
	}

