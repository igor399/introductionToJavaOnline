package by.epam.programming_with_classes.agregationandcomposition.text;

public class Word {

	private String word;

	Word(String word) {
		this.word = word;
	}

	@Override
	public String toString() {
		return word;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}
}
