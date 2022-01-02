package by.epam.basics_of_software_code_development.linear;

public class Task2 {

// 2. Вычислить значение выражения по формуле (все переменные принимают
// действительные значения): 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2

	public static void main(String[] args) {
		double a1 = 2.9;
		double b1 = 7.8;
		double c1 = 3.1;
		double z1 = (b1 + Math.sqrt(Math.pow(b1, 2) + 4 * a1 * c1)) / 2 * a1 - Math.pow(a1, 3) * c1 + Math.pow(b1, -2);

		System.out.println(z1);
	}
}
