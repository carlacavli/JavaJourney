package Day20Practice;

import java.util.HashMap;

public class CheckBeforePutValue {
    // put letters in your map, value = 0
    // if map contains that letter already print => "I have it"
    public static void main(String[] args) {
        String sentence = "hello";

        HashMap<Character, Integer> letterMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
        for (int i = 0; i <sentence.length() ; i++) {
        }
        if (sentence.contains("h")){

            System.out.println("i have it already");

        }}}

// mahiyenin yaptigi
//    String sentence = "hello";
//    HashMap<Character, Integer> letterMap = new HashMap<>();
//    char[] sentenceArray = sentence.toCharArray();
//
//
//   for (char letter : sentenceArray) {
//        if (letterMap.containsKey(letter)) {
//        letterMap.put(letter, 0);
//        } }
//        System.out.println("I have it");

