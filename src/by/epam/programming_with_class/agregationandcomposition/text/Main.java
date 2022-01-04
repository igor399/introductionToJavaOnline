package by.epam.programming_with_class.agregationandcomposition.text;

public class Main {

	public static void main(String[] args) {
		Text text = new Text("Заголовок", "Какой-то текст или поэма");

		text.printTitle();
		text.printText();
	}
}
