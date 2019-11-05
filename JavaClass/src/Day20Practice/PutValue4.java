package Day20Practice;

import java.util.HashMap;

public class PutValue4 {
    public static void main(String[] args) {

        String sentence = " hello";
        HashMap<Character, Integer> lettermap = new HashMap<>();


            char[] sentenceArray = sentence.toCharArray();
            for (char letter : sentenceArray) {
                lettermap.put(letter, 0);
            }
            System.out.println(lettermap);
        }

    }

