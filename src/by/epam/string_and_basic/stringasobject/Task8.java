package by.epam.string_and_basic.stringasobject;

import java.util.Comparator;
import java.util.stream.Stream;

public class Task8 {

//	8. Вводится строка слов, разделенных пробелами. Найти самое длинное слово и вывести его на экран. 
//	Случай, когда самых длинных слов может быть несколько, не обрабатывать.

	public static void main(String[] args) {
		System.out.println(longWord("today was rainy and i stay at home and do my homework"));
	}

	public static String longWord(String text) {
		String[] words = text.split(" ");
		String longestWord;
		
		longestWord = Stream.of(words).max(Comparator.comparing(String::length)).get();
		
		return longestWord;
	}
}
