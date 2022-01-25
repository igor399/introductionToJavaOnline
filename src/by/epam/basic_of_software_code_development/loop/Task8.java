package by.epam.basic_of_software_code_development.loop;

public class Task8 {

// 8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.	

	public static void main(String[] args) {
		int aa = 24563;
		int bb = 283113;
		int dd;
		int cc;

		while (aa > 0) {
			dd = aa % 10;
			aa = aa / 10;
			cc = bb;

			while (cc > 0) {

				if (cc % 10 == dd) {
					System.out.print(dd + "  ");

					break;
				}
				cc = cc / 10;
			}
		}
	}
}
