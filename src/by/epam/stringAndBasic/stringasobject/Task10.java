package by.epam.stringAndBasic.stringasobject;

public class Task10 {

//	10. Строка X состоит из нескольких предложений, каждое из которых кончается точкой,  
//	восклицательным или вопросительным знаком. Определить количество предложений в строке X.

	public static void main(String[] args) {
		System.out.println("кол-во предложений: " + findPunctMarks("Этот текст состоит из нескольких предлжений. Интересно? Попробуй найди сколько их!"));
	}

	public static int findPunctMarks(String text) {
		int numMarks = 0;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
				numMarks++;
			}
		}

		return numMarks;
	}
}
