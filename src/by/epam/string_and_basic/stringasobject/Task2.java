package by.epam.string_and_basic.stringasobject;

public class Task2 {

//	2. В строке вставить после каждого символа 'a' символ 'b'.

	public static void main(String[] args) {
		System.out.println(insertB("auch, it was a very bad idea "));
	}

	public static String insertB(String text) {
		StringBuilder builder = new StringBuilder(text);

		for (int i = 0; i < builder.length(); i++) {

			if (builder.charAt(i) == 'a')
				builder.insert(i+1, 'b');
		}
		
		return String.valueOf(builder);
	}
}
