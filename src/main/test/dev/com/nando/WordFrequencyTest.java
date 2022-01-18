package dev.com.nando;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class WordFrequencyTest {

	@Test
	public void testJavaBean() {
		WordFrequencyAnalyzerUtility w = new WordFrequencyAnalyzerUtility();
		System.out.println(w.calculateHighestFrequency(w.text()));
		System.out.println(w.calculateMostFrequentNWords(w.text(), 1));
		assertEquals(3, w.calculateFrequencyForWord(w.text(), "you"));
	}

}
