package by.epam.algorithmization.arrayofarray;

public class Task6 {

	public static void main(String[] args) {
		
	// 6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
		
        printa(6);
    }

    public static void printa(int n) {
    	
        int[][] a = new int[n][n];

        for (int i = 0; i < a.length; i++) {
        	
            if (i <= (a.length - 1) / 2) {
            	
                for (int j = i; j < a[i].length - i; j++) {

                    a[i][j] = 1;
                }
            } else {
            	
                for (int j = a[i].length - i - 1; j < i + 1; j++) {
                	
                    a[i][j] = 1;
                }
            }
        }
        
        for (int i = 0; i < a.length; i++) {  
        	
            for (int j = 0; j < a[i].length; j++) {         	
                System.out.print(a[i][j] + "  ");
            }           
            System.out.println();
        }
    }
}


