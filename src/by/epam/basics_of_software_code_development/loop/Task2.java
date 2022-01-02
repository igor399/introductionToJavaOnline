package by.epam.basics_of_software_code_development.loop;

public class Task2 {

//2. Вычислить значения функции на отрезке [а,b] c шагом h:	

	public static void main(String[] args) {
		int h2 = 3;
		int a2 = 3;
		int b2 = 9;
		int yf;

		for (int i = a2; i <= b2; i += h2) {

			if (i > 2) {
				yf = i;
				
			} else {
				yf = i * (-1);
			}
			System.out.println("При х = " + i + " у = " + yf);
		}
	}
}
