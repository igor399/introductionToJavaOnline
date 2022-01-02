package by.epam.algorithmization.array;

public class Task4 {
	/*
	 * 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
	 * наименьший элементы.
	 */

	public static void main(String[] args) {

		double[] b4 = new double[] { 1.2, -1, 0, 10, 4, 3, -1.6, -9, 7.8 };

		print(b4);

	}

	public static void print(double[] b4) {

		int imax = 0;

		int imin = 0;

		

		for (int i = 0; i < b4.length; i++) {

			if (b4[i] < b4[imax]) {
				imax = i;
			}

			if (b4[i] > b4[imin]) {

				imin = i;
			}
		}

		double k4 = b4[imax];

		b4[imax] = b4[imin];

		b4[imin] = k4;

		for (int i = 0; i < b4.length; i++) {

			System.out.print(b4[i] + "  ");
		}
	}
}
