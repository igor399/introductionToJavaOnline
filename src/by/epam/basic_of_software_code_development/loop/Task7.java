package by.epam.basic_of_software_code_development.loop;

import java.util.Scanner;

public class Task7 {

//7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.	

	public static void main(String[] args) {
		int i, del, m7, n7;

		Scanner sc = new Scanner(System.in);

		System.out.print("m >> ");
		m7 = sc.nextInt();

		System.out.print("n >> ");
		n7 = sc.nextInt();

		for (i = m7; i <= n7; i++) {
			System.out.print(i + ": ");

			for (del = 2; del < i; del++) {

				if (i % del == 0) {
					System.out.print(del + " ");
				}
			}
			System.out.println();
		}
	}
}
