package dev.com.nando;

import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.Test;

public class WordFrequencyTest {

	@Test
	public void testJavaBean() {
		WordFrequencyAnalyzerUtility w = new WordFrequencyAnalyzerUtility();
		System.out.println(w.calculateHighestFrequency(w.text()));
		assertNotEquals(1, w.calculateMostFrequentNWords(w.text(), 4));
		assertNotEquals(4, w.calculateFrequencyForWord(w.text(), "you"));
	}

}