package by.epam.stringAndBasic.stringasobject;

public class Task6 {

//6. Из заданной строки получить новую, повторив каждый символ дважды.

	public static void main(String[] args) {
		System.out.println(copyOfSymbol("A B C D E F G"));
	}

	public static String copyOfSymbol(String text) {
		StringBuilder stringBuilder = new StringBuilder(text);
		StringBuilder builder = new StringBuilder();

		for (int i = 0; i < stringBuilder.length(); i++) {
			builder.append(stringBuilder.charAt(i));
			builder.append(stringBuilder.charAt(i));
		}
		
		return String.valueOf(builder);
	}
}
