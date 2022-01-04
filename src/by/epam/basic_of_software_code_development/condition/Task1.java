package by.epam.basic_of_software_code_development.condition;

public class Task1 {

//1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.	

	public static void main(String[] args) {
		int alfa1 = 40;
		int alfa2 = 30;
		int alfa3 = 180 - (alfa1 + alfa2);

		if (alfa1 > 0 && alfa2 > 0 && alfa3 > 0) {
			System.out.println(" Существует ");

			if (alfa1 == 90 || alfa2 == 90 || alfa3 == 90) {
				System.out.println(" Существует прямоугольный ");
			}

		} else {
			System.out.println(" Не существует ");
		}
	}
}
