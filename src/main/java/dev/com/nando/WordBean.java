package dev.com.nando;

public class WordBean implements WordFrequency {
	private String word;
	private int frequency;

	public WordBean() {
	}

	public WordBean(String word, int frequency) {
		this.word = word;
		this.frequency = frequency;
	}

	@Override
	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	@Override
	public int getFrequency() {
		return frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	@Override
	public String toString() {
		return "{" + "word='" + word + ", frequency='" + frequency + '}';
	}
}
