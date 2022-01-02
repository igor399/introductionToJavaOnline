package by.epam.programming_with_classes.agregationandcomposition.text;

public class Sentence {
	
	private StringBuilder sentence;
	
	public Sentence(StringBuilder sentence) {
		this.sentence  = sentence;
	}
	
	public Sentence(String sentence) {
		this.sentence  = new StringBuilder(sentence);
	}

	void addWord(String word) {
		sentence.append(word);
	}
	
	void print() {
		System.out.println(sentence);
	}

	@Override
	public String toString() {
		return sentence.toString();
	}
}
