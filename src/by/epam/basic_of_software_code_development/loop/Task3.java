package by.epam.basic_of_software_code_development.loop;

public class Task3 {

//3. Найти сумму квадратов первых ста чисел.

	public static void main(String[] args) {
		int n3 = 100;
		int sum = 0;

		for (int i = 1; i <= n3; i++) {
			sum += Math.pow(i, 2);
		}
		System.out.println(sum);
	}
}
