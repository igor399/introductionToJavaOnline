package by.epam.algorithmization.decomposition;

public class Task5 {

//5. Составить программу, которая в массиве A[N] находит второе по величине число 
//(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

	public static void main(String[] args) {
		double[] a = newarray();

		System.out.print("PreMaxValue >>" + preMaxValue(a));
	}

	public static double[] newarray() {
		int n = (int) (Math.random() * 10);
		double[] a = new double[n];

		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		
		System.out.println();
		
		return a;
	}

	private static double preMaxValue(double[] a) {
		double maxValue = a[0];
		double preMaxValue = a[0];

		for (int i = 1; i < a.length; i++) {
			
			if (maxValue < a[i]) {
				preMaxValue = maxValue;
				maxValue = a[i];
			}
			
			if (preMaxValue < a[i] && maxValue > a[i]) {
				preMaxValue = a[i];
			}
		}
		return preMaxValue;
	}
}
