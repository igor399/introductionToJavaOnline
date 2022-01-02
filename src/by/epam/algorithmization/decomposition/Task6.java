package by.epam.algorithmization.decomposition;

public class Task6 {
	
//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

	public static void main(String[] args) {
		
		System.out.println(findNod(1,3,7));
	}

	public static int nod(int firstnumber, int secondnumber) {

		while (firstnumber != 0 && secondnumber != 0) {

			if (firstnumber > secondnumber) {
				firstnumber = firstnumber % secondnumber;

			} else {
				secondnumber = secondnumber % firstnumber;
			}
		}
		return firstnumber + secondnumber;
	}
	
	  private static boolean findNod(int firstNumber, int secondNumber, int thirdNumber) {
	        int nod = nod(firstNumber, secondNumber);
	        nod = nod(nod, thirdNumber);

	        System.out.println("Nod = " + nod);

	        return nod == 1;
	    }
}

