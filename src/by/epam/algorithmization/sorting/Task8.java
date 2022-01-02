package by.epam.algorithmization.sorting;

public class Task8 {

//8.Даны дроби p1/q1, p2/q2... pn/qn (pi,qi - натуральные). Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

	public static void main(String[] args) {

		int[] numeratArray = new int[] { 1, 3, 5, 7, 8, 9, 11 };
		int[] denomArray = new int[] { 2, 5, 7, 9, 1, 10, 13, 6, };
		int maxValueDenArray = denomArray[0];

		for (int i = 1; i < denomArray.length; i++) {

			if (maxValueDenArray < denomArray[i]) {
				maxValueDenArray = denomArray[i];
			}
		}
		
		boolean findNok = false;
		int nok = maxValueDenArray;
		int factor = 1;
		
		while (!findNok) {
			nok = maxValueDenArray * factor;
			findNok = true;

			for (int i = 0; i < denomArray.length; i++) {

				if (nok % denomArray[i] != 0) {
					findNok = false;
				}
			}
			factor++;
		}
		System.out.println("НОК = " + nok);

		int[] sortArray = new int[] {};
		
		for (int i = 0; i < sortArray.length - 1; i++) {
			int maxInd = i;

			for (int j = i + 1; j < sortArray.length; j++) {

				if (sortArray[j] < sortArray[maxInd]) {
					maxInd = j;
				}
				
				if (maxInd != i) {
					int tmp = sortArray[i];
					sortArray[i] = sortArray[maxInd];
					sortArray[maxInd] = tmp;
				}
			}
		}
		
		for (int i = 0; i < numeratArray.length; i++) {
			System.out.print(numeratArray[i] + "/" + nok + "\t");
		}
	}
}
