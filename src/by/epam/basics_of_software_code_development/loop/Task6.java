package by.epam.basics_of_software_code_development.loop;

public class Task6 {

//6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.	

	public static void main(String[] args) {

		for (int i = 33; i <= 126; i++) {
			System.out.println(i + " " + (char) i);
		}
		System.out.println();

	}
}
