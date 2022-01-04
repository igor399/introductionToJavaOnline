package by.epam.string_and_basic.stringasobject;

public class Task1 {

//1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

	public static void main(String[] args) {		
		System.out.println(numbOfSpace(" This day goes on a very        veeeeeeryyyyy lon     time...   "));
	}

	public static int numbOfSpace(String text) {

		int maxSpaceCount = 0;
		int tmpSpaceCount = 0;
		StringBuilder builder = new StringBuilder(text);

		for (int i = 0; i < builder.length(); i++) {

			if (builder.charAt(i) == ' ') {
				tmpSpaceCount++;

			} else {
				
				if (maxSpaceCount < tmpSpaceCount) {
					maxSpaceCount = tmpSpaceCount;
				}
				tmpSpaceCount = 0;
			}
		}
		
		return maxSpaceCount;
	}
}
