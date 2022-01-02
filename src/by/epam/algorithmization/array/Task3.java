package by.epam.algorithmization.array;

public class Task3 {

	public static void main(String[] args) {
		/* 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
		положительных и нулевых элементов.
		*/	

			double [] b3 = new double [] {1.2, -1, 0, 10, 4,3, -1.6, -9, 7.8};
			
			int numOfPos = 0;
			
			int numOfZero = 0;
			
			int numOfneg = 0;
			
			double t = 0;
			
			for (int i = 0; i < b3.length; i++) {
				
			      t = b3[i];

				if (t > 0) {
					
					numOfPos++;
					
				} else if (t == 0) {
					
					numOfZero++;
					
				}else {
					numOfneg++;
				}
			}
			System.out.println("Кол-во положит эл-ов: " + numOfPos + " Кол-во нулевых эл-ов: " + numOfZero + " Кол-во отридц эл-ов: " + numOfneg);
			System.out.println();

	}

}
