package by.epam.basics_of_software_code_development.condition;

public class Task2 {

// 2. Найти maxmin ((a, b), min(c, d))

	public static void main(String[] args) {
		int a8 = 3;
		int b8 = 5;
		int c8 = 1;
		int d8 = 7;
		int min1, min2;

		if (a8 >= b8) {
			min1 = b8;

		} else {
			min1 = a8;
		}

		if (c8 >= d8) {
			min2 = d8;

		} else {
			min2 = c8;
		}

		if (min1 > min2) {
			System.out.println(min1);

		} else {
			System.out.println(min2);
		}
	}
}
