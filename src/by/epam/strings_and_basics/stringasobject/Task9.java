package by.epam.strings_and_basics.stringasobject;

public class Task9 {

//	9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

	public static void main(String[] args) {
		String str = "dsf d fFFfd zhGr  hg T GGFgfgqwr";

		System.out.println("кол-во строчных букв: " + (lowerSymbol(str)));
		System.out.println("кол-во прописных букв: " + (upperSymbol(str)));
	}

	public static int lowerSymbol(String str) {
		int loweCount = 0;
		
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) > 'a' && str.charAt(i) < 'z') {
				loweCount++;
			}
		}
		
		return loweCount;
	}

	public static int upperSymbol(String str) {
		int upperCount = 0;
		
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) > 'A' && str.charAt(i) < 'Z') {
				upperCount++;
			}
		}
		
		return upperCount;
	}
}
