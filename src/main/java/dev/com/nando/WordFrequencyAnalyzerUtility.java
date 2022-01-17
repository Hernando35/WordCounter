package dev.com.nando;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;


public class WordFrequencyAnalyzerUtility implements WordFrequencyAnalyzer{
    private WordBean wordBean;

    public WordFrequencyAnalyzerUtility(){
         this.wordBean = new WordBean();
    }

    protected String text(){
        String text = "Slip inside of the eye of your mind and all it can be different,you know and you mind inside of me, because of you";

        return text;
    }

    /*
     * This method returns the highest frequency in the text (several
     * words might have this frequency)
     *
     * @param String text
     *
     * returns int highestFrequency
     *
     *
     * */
    @SuppressWarnings("unused")
	@Override
    public int calculateHighestFrequency(String text) {
        int frequency = 1;
        int highestFrequency = 0;
        String word = null;
        //dividing the text in substrings
        String[] split = text.split(" ");
        Arrays.sort(split);
        //Arrays.toString(split);
        wordBean.setWord(split[0]);
        word = wordBean.getWord();
        String curr = split[0];
        for(int i = 1; i<split.length; i++){
            if(split[i].equals(curr)){
                frequency++;
            } else {
                frequency = 1;
                curr = split[i];
            }
            if(highestFrequency < frequency){
                wordBean.setFrequency(frequency);
                highestFrequency = wordBean.getFrequency();
                wordBean.setWord(split[i]);
            }
        }
        System.out.println("highestFrequency: " + highestFrequency + ", word: " + wordBean.getWord());

        return highestFrequency;
    }

    /*
    * This method returns the frequency of the specified word
    *
    * @param String text
    * @param String word
    *
    * @return int frequencyOfWord
    * */
    @Override
    public int calculateFrequencyForWord(String text, String word) {
        int frequency = 0;
        int frequencyOfWord = 0;
        //dividing the text in substrings
        String[] split = text.split(" ");
        Arrays.sort(split);
        if (StringUtils.isNoneEmpty(word)) {
            for (int i = 1; i < split.length; i++) {
                String repeated = split[i];
                if (repeated.equals(word)) {
                    word = repeated;
                    frequency++;
                    if (frequency >= 1) {
                        frequencyOfWord = frequency;
                        wordBean.setFrequency(frequencyOfWord);
                        frequencyOfWord = wordBean.getFrequency();
                        wordBean.setWord(repeated);
                    }
                }
            }
        } else {
                frequencyOfWord = frequency;
                System.out.println("word: " + word + "not found!");
            }
            System.out.println("frequency: " + frequencyOfWord + ", word: " + word);
            return frequencyOfWord;
        }

    /*
    * This method returns a list of the most frequent „n‟ words in
    * the input text, all the words returned in lower case
    *
    * @param String text
    * @param int n
    *
    * return List<WordFrequency> listOfWords
    */
    @Override
    public List<WordFrequency> calculateMostFrequentNWords(String text, int n) {
        List<WordFrequency> listOfWords = new ArrayList<>();
        String valueKeys = "";
        String[] list = text.split(" ");
        Map<String, Integer> countMap = new HashMap<>();
        for (String word: list){
            Integer count = countMap.get(word);
            if(count == null) {
                count = 0;
            }
            countMap.put(word, (count.intValue()+1));
            valueKeys = countMap.toString();
        }
        wordBean.setWord(valueKeys);
        listOfWords.add(wordBean);
        return listOfWords;
    }
    
	public static void main(String[] args) {
		WordFrequencyAnalyzerUtility w = new WordFrequencyAnalyzerUtility();
		System.out.println(w.calculateHighestFrequency(w.text()));
		System.out.println(w.calculateFrequencyForWord(w.text(), "you"));
		System.out.println(w.calculateMostFrequentNWords(w.text(), 1));
	}
}


