package by.epam.stringAndBasic.stringasarray;

public class Task2 {
	
//2. Замените в строке все вхождения 'word' на 'letter'.

	public static void main(String[] args) {
		
		System.out.println(newText("so much word and word and some word or other word"));
	}
		
		public static String newText(String text) {
			
			text = text.replaceAll("word", "letter");
			
		return text;
	}
}
