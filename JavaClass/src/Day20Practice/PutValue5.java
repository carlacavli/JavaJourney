package Day20Practice;

import java.util.HashMap;

public class PutValue5 {
    public static void main(String[] args) {
        //put only 'h' letter as keys into your HashMap,
        // put value = 0

        // {h=0}
        String sentence = "jonny hello asd";

        HashMap<Character, Integer> letterMap = new HashMap<>();

        char[] sentenceArray = sentence.toCharArray();
        for (char letter : sentenceArray) {
            if(letter == 'h') {
                letterMap.put(letter, 0);
            }
        }

        System.out.println(letterMap);
        // {h=0}



    }


}
