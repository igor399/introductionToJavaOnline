package by.epam.stringAndBasic.stringasobject;

public class Task7 {

//	7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. 
//	Например, если было введено "abc cde def", то должно быть выведено "abcdef".

	public static void main(String[] args) {
		System.out.println(correctString("   ABC CCDDLG AKGDB   EPORE"));
	}

	public static String correctString(String text) {
		StringBuilder builder = new StringBuilder(text);

		for (int i = 0; i < builder.length(); i++) {
			char tmpChar = builder.charAt(i);

			for (int j = i + 1; j < builder.length(); j++) {

				if (builder.charAt(j) == tmpChar) {
					builder.deleteCharAt(j);
				}
			}
		}
		builder.deleteCharAt(builder.indexOf(" "));
		
		return String.valueOf(builder);
	}
}
