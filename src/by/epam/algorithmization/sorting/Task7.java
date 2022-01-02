package by.epam.algorithmization.sorting;

public class Task7 {

//7. Пусть даны две неубывающие последовательности действительных чисел a1<a2<...<an и b1<b2<...<bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1<b2<...<bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

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
					System.out.printf("поместили знач-е %d из 2-го массива на место индекса %d" + "\n",
							secondArray[indexSecondArray], indexEndArrayy);
					indexSecondArray++;
				}

			} else if (indexFirstArray < firstArray.length && indexSecondArray >= secondArray.length) {
				endArray[indexEndArrayy] = firstArray[indexFirstArray];
				indexFirstArray++;

			} else {
				endArray[indexEndArrayy] = secondArray[indexSecondArray];
				System.out.printf("поместили знач-е %d из 2-го массива в конец 1-го" + "\n",
						secondArray[indexSecondArray]);
				indexSecondArray++;
			}
			indexEndArrayy++;
		}

		for (int indexEndArray = 0; indexEndArray < endArray.length; indexEndArray++) {
			System.out.print(endArray[indexEndArray] + " ");
		}
	}
}
