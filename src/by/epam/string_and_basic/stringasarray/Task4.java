package by.epam.string_and_basic.stringasarray;

public class Task4 {
	
//4. В строке найти количество чисел.

	public static void main(String[] args) {

		System.out.println(amountOfNumber("dfddf 788 gfdg21 33g3 5656 gfdggw1"));
	}

	public static int amountOfNumber(String text) {

		int amountNumb = 0;
		String [] numbArray = text.split("\\D");

		for (String number : numbArray) {

			if (number.length() != 0) {
				amountNumb++;
			}
		}

		return amountNumb;
	}
}
