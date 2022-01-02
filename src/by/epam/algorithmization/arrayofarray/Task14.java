package by.epam.algorithmization.arrayofarray;

public class Task14 {

//	14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//	единиц равно номеру столбца.
	
	public static void main(String[]args) {
		
		int m =(int)(Math.random()*31);
		int n = (int)(Math.random()*31);
		
		
		int [][] array = new int[m][n];
		
		for (int i = 0; i<m; i++){
			
			for (int j = 0; j<n; j++) {
				
				if (i<=j) {
				
				array[i][j] = 1;
				}
				
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	
	}
}
