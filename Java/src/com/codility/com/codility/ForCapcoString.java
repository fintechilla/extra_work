package com.codility;

import java.util.HashMap;
import java.util.Map;

public class ForCapcoString {
    public int solution(String phrase){
        String delims = "[ ,.!()]+";
        String[] tokens = phrase.split(delims);

        Map<String, Integer>words = new HashMap<>();
        for (String token: tokens) {
            System.out.println(token + " " + token.length() + "\r" );
            if(words.containsKey(token)){
                words.put(token, words.get(token) + 1);
            }else{
                words.put(token, 1);
            }
        }
        System.out.println("Show words with frequency**************...");
        int[] allWords = new int[6];

        for (Map.Entry<String, Integer> word:words.entrySet()) {
            System.out.println(word.getKey() + " " +word.getValue());
            allWords[0]++;
            if(word.getValue()==1){
                allWords[1]++;
            }else if(word.getValue()==2){
                allWords[2]++;
            }else if(word.getValue()==3) {
                allWords[3]++;
            }else if(word.getValue()==4) {
                allWords[4]++;
            }
            else{
                allWords[5]++;
            }
        }
        System.out.println("words frequency:*********** ");
        for (int i = 0; i < allWords.length; i++) {
            System.out.format("#words %d : freq : %d \n", i, allWords[i]);
        }
        return allWords[0];

    }

    public static void main(String[] args){
        String phrase = "The purpose of lorem ipsum is to create a natural looking block of text " +
                "(sentence, paragraph, page, etc.) that doesn't distract from the layout. A practice not " +
                "without controversy, laying out pages with meaningless filler text can be very useful when " +
                "the focus is meant to be on design, not content.\n" +
                "\n" +
                "The passage experienced a surge in popularity during the 1960s when Letraset used it " +
                "on their dry-transfer sheets, and again during the 90s as desktop publishers bundled " +
                "the text with their software. Today it's seen all around the web; on templates, websites," +
                " and stock designs. Use our generator to get your own, or read on for the authoritative" +
                " history of lorem ipsum.";
        ForCapcoString forCapcoString = new ForCapcoString();
        System.out.println("Result***************: " + forCapcoString.solution(phrase));
    }
}
