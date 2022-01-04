package by.epam.basic_of_software_code_development.loop;

import java.math.BigInteger;

public class Task4 {
	
// 4. Составить программу нахождения произведения квадратов первых двухсот чисел.	

	public static void main(String[] args) {
		BigInteger s = BigInteger.valueOf(1);

		for (int i = 1; i <= 200; i++) {
			s = s.multiply(BigInteger.valueOf((long) i * i));
		}
		System.out.println(s);
	}
}
