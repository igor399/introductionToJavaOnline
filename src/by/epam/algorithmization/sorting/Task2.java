package by.epam.algorithmization.sorting;

public class Task2 {

//2. Даны две последовательности a1<a2<...<an и b1<b2<...<bm. Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей.Дополнительный массив не использовать.

	public static void main(String[] args) {

		int[] firstArray = new int[] { 3, 5, 7, 9, 11, 13, 16, 17 };
		int[] secondArray = new int[] { 1, 2, 14, 22, 27, 30, 33, 37 };
		int[] endArray = new int[firstArray.length + secondArray.length];

		int indexFirstArray = 0;
		int indexSecondArray = 0;
		int indexEndArrayy = 0;

		while (indexEndArrayy < endArray.length) {

			if (indexFirstArray < firstArray.length && indexSecondArray < secondArray.length) {

				if (firstArray[indexFirstArray] < secondArray[indexSecondArray]) {
					endArray[indexEndArrayy] = firstArray[indexFirstArray];
					indexFirstArray++;

				} else {
					endArray[indexEndArrayy] = secondArray[indexSecondArray];
					indexSecondArray++;
				}

			} else if (indexFirstArray < firstArray.length && indexSecondArray >= secondArray.length) {
				endArray[indexEndArrayy] = firstArray[indexFirstArray];
				indexFirstArray++;

			} else {
				endArray[indexEndArrayy] = secondArray[indexSecondArray];
				indexSecondArray++;
			}
			indexEndArrayy++;
		}

		for (int indexEndArray = 0; indexEndArray < endArray.length; indexEndArray++) {
			System.out.print(endArray[indexEndArray] + " ");
		}
	}
}
