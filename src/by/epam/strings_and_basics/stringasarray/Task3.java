package by.epam.strings_and_basics.stringasarray;

public class Task3 {

//3. В строке найти количество цифр.

	public static void main(String[] args) {

		System.out.println(numberOfDigit("dfddf 788 gfdg21 33g3 5656 gfdggw1"));
	}

	public static int numberOfDigit(String text) {

		int digitNumb = 0;
		char[] symbols = text.toCharArray();

		for (char symbol : symbols) {

			if (Character.isDigit(symbol)) {
				digitNumb++;
			}
		}

		return digitNumb;
	}
}
