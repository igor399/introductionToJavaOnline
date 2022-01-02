package by.epam.basics_of_software_code_development.loop;

public class Task5 {

//5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е. Общий член ряда имеет вид:		

	public static void main(String[] args) {
		double sum5 = 0.0;
		double e = 0.8;
		double an = 0;
		int n5 = 12;

		for (int i = 0; i <= n5; i++) {
			an = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);

			if (Math.abs(an) >= e) {
				sum5 += an;
			}
		}
		System.out.println("Сумма равна " + sum5);
	}
}
