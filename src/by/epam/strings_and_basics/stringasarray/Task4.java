package by.epam.strings_and_basics.stringasarray;

public class Task4 {
	
//4. В строке найти количество чисел.

	public static void main(String[] args) {

		System.out.println(amountOfТumber("dfddf 788 gfdg21 33g3 5656 gfdggw1"));
	}

	public static int amountOfТumber(String text) {

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
