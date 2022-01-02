package by.epam.basics_of_software_code_development.condition;

public class Task5 {

//5. Вычислить значение функции:	

	public static void main(String[] args) {
		double xf = 3.1;

		if (xf <= 3) {
			xf = Math.pow(xf, 2) - 3 * xf + 9;
			System.out.println("xf = " + xf);

		} else {

			if (xf >= 3) {
				xf = 1 / (Math.pow(xf, 3) + 6);
			}
			System.out.println("xf = " + xf);
		}
	}
}
