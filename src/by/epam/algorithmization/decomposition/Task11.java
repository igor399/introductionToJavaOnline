package by.epam.algorithmization.decomposition;

public class Task11 {

//	11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

	public static void main(String[] args) {

	}

	public static int numbLength(int firtsNumb, int secondNumb) {
		int firstLength = 0;
		int secondLength = 0;
		int tmp = firtsNumb;

		while (tmp != 0) {
			firstLength++;
			tmp /= 10;
		}
		tmp = secondNumb;

		while (tmp != 0) {
			secondLength++;
			tmp /= 10;
		}

		if (firstLength > secondLength) {
			return firstLength;

		} else {
			return secondLength;
		}
	}
}
