package by.epam.programmingWithClass.agregationandcomposition.text;

//1. Создать объект класса Текст, используя классы Предложение, Слово.
//Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Text {

	private StringBuilder text;
	private String title;

	public Text(String title, StringBuilder text) {		
		this.text = text;
		this.title = title;
	}
	
	Text(String title, String text) {
		this.text = new StringBuilder(text);
		this.title = title;
	}
	
	void addSentence(Sentence sentence) {
		text.append(sentence.toString());
	}
	
	void addWord (String word) {
		text.append(word);
	}
	
	void printText() {
		System.out.println(text.toString());
	}
	
	void printTitle() {
		System.out.println(title);
	}
}
