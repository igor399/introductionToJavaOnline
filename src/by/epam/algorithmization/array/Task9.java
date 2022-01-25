package by.epam.algorithmization.array;

public class Task9 {
	/*
	 * 9. В массиве целых чисел с количеством элементов n найти наиболее часто
	 * встречающееся число. Если таких чисел несколько, то определить наименьшее из
	 * них.
	 */
	public static void main(String[] args) {
		int[] a = new int[] { 1, 1, 2, 5, 7, 3, 3, 9, 3, 3, 1, 1 };

		int[] numOfRep = new int[a.length];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i] == a[j]) {
					numOfRep[i]++;
				}
			}
		}

		int maxRepCount = numOfRep[0];
		int minRepValue = a[0];

		for (int i = 1; i < numOfRep.length; i++) {

			if (numOfRep[i] > maxRepCount){
				maxRepCount = numOfRep[i];
				minRepValue = a[i];
			}

			if (numOfRep[i] == maxRepCount && a[i] < minRepValue) {
				minRepValue = a[i];
			}
		}
		System.out.println(minRepValue);
	}
}
