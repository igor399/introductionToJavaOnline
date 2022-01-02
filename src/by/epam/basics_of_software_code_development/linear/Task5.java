package by.epam.basics_of_software_code_development.linear;

public class Task5 {

//5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
//ННч ММмин SSc.

	public static void main(String[] args) {
		int time = 10439;
		
		int hourse = time / 3600;
		int ss = time - (hourse * 3600);
		int minutes = ss / 60;
		int seconds = ss - (minutes * 60);

		System.out.println(hourse + "." + minutes + "." + seconds);
	}
}
