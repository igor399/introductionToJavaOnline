package by.epam.strings_and_basics.stringasarray;

public class Task5 {

//	5. Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
//	Крайние пробелы в строке удалить.

	public static void main(String[] args) {
		
		String str1 = "    Hello      Tony!   How  are  you?     ";
		System.out.println(str1.replaceAll(" {2,}", " ").trim());
	}
}
