package by.epam.algorithmization.decomposition;

public class Task7 {
	
//7. Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

	public static void main(String[] args) {
		
		   System.out.println(findSumFactorial());
    }

    public static int findSumFactorial() {
        int sumOfFactorial = 0;
        
        for (int i = 1; i < 10; i++) {
            int fact = 1;
            
            if (i % 2 != 0) {
            	
                for (int j = 1; j <= i; j++) {
                    fact *= j;
                }
                sumOfFactorial += fact;
            }
        }
        return sumOfFactorial;
    }
}

