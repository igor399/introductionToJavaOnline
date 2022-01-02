package by.epam.algorithmization.decomposition;

public class Task4 {

//4. На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
//	из пар точек самое большое расстояние. Указание: координаты точек занести в массив.

	public static void main(String[] args) {

		int n = (int) (Math.random() * 100);
		int[][] point = new int[n][2];

		printDist(point);

		double maxDist = findMaxDist(point);

		System.out.println(maxDist);

	}

	public static double findMaxDist(int point[][]) {

		double maxDist = 0;

		for (int i = 0; i < point.length - 1; i++) {

			double tmp = 0;
			int a[] = point[i];
			int b[] = point[i + 1];

			tmp = Math.sqrt(Math.pow(b[0] - a[0], 2) + Math.pow(b[1] - a[1], 2));

			if (tmp > maxDist) {
				maxDist = tmp;
			}
		}
		return maxDist;
	}

	public static void printDist(int[][] point) {

		for (int i = 0; i < point.length; i++) {

			for (int j = 0; j < point[i].length; j++)
				point[i][j] = (int) (Math.random() * 100);
		}
	}
}
