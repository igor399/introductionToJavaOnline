package by.epam.algorithmization.arrayofarray;

public class Task4 {

//4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

	public static void main(String[] args) {

		int n = 4;
		int[][] a = new int[n][n];

		for (int i = 0; i < n; i += 2) {

			for (int j = 0; j < n; j++) {

				a[i][j] = j + 1;
				
				a[i + 1][j] = n - j;

			}
		}

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a[i].length; j++){			
		
				System.out.print(a[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
