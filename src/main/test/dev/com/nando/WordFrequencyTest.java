package dev.com.nando;

import org.junit.jupiter.api.Test;

public class WordFrequencyTest {

	@Test
	public void testJavaBean() {
		WordFrequencyAnalyzerUtility w = new WordFrequencyAnalyzerUtility();
		System.out.println(w.calculateHighestFrequency(w.text()));
		System.out.println(w.calculateFrequencyForWord(w.text(), "you"));
		System.out.println(w.calculateMostFrequentNWords(w.text(), 1));
		// assertEquals(;);
	}

	public static void main(String[] args) {
		WordFrequencyAnalyzerUtility w = new WordFrequencyAnalyzerUtility();
		System.out.println(w.calculateHighestFrequency(w.text()));
		System.out.println(w.calculateFrequencyForWord(w.text(), "you"));
		System.out.println(w.calculateMostFrequentNWords(w.text(), 1));
	}
}
