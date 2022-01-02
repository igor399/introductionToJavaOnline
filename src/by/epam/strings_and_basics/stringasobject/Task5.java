package by.epam.strings_and_basics.stringasobject;

public class Task5 {

//	5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

	public static void main(String[] args) {

		System.out.println(numberOfA("mom washed the frame"));
	}

	public static int numberOfA(String text) {
		int countA = 0;
		StringBuilder builder = new StringBuilder(text);

		for (int i = 0; i < builder.length(); i++) {

			if (builder.charAt(i) == 'a') {
				countA++;
			}
		}
		
		return countA;
	}
}
