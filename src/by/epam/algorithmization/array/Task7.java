package by.epam.algorithmization.array;

public class Task7 {
	//7. Даны действительные числа a1,a2,a2...an. Найти max( a1 + a2n,  a2 + a2n−1,  an + an+1)	
	
	public static void main(String[] args) {
	     
		double[] a = new double[] { 2.8, 66.6, 12.14, 23.123, 1.888};
		
		int n = a.length/2;
		
		double znach1 = a[0] + a[2*n];
		
		double znach2 = a[1] + a[2*n - 1];
		
		double znach3 = a[n] + a[n + 1];
		
		if ((znach1 > znach2) && (znach1 > znach3)) {
			
			System.out.println("znach1 =" + znach1);	
		}	
		 if (znach2 > znach3 ){
				
				System.out.println("znach2 =" + znach2);		
		 }
			else {
				System.out.println("znach3 =" + znach3);	
			
		 }
		 }
	}


