package by.epam.stringAndBasic.stringasobject;

public class Task4 {

//4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

	public static void main(String[] args) {
		System.out.println(wordRefactor("информатика"));
	}

	public static String wordRefactor(String text) {
		String endWord = "";
		
		endWord = endWord.concat(String.copyValueOf(text.toCharArray(), text.indexOf('т'), 1));
		endWord = endWord.concat(String.copyValueOf(text.toCharArray(), text.indexOf('о'), 1));
		endWord = endWord.concat(String.copyValueOf(text.toCharArray(), text.indexOf('р'), 1));
		endWord = endWord.concat(String.copyValueOf(text.toCharArray(), text.indexOf('т'), 1));
		
		return endWord;
	}
}
