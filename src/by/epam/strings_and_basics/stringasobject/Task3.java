package by.epam.strings_and_basics.stringasobject;

public class Task3 {

//	3. Проверить, является ли заданное слово палиндромом.

	public static void main(String[] args) {
		System.out.println(Palindrome("довод"));
	}

	private static boolean Palindrome(String text) {
		String newWord = new StringBuilder(text).reverse().toString();

		return newWord.equalsIgnoreCase(text);
	}
}
