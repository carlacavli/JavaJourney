package Day20;
//   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
//part 1
// print every character in separate line

import javax.print.DocFlavor;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;

public class HasMapTask15 {
    public static void main(String[] args) {
        //17. Count letters in string
        //   "BECOME A SOFTWARE TEST ENGINEER IN 6 MONTHS!"
        // for ex:
        // A: 2
        // B: 1
        // ...
        //part 1
        // print every character in separate line

        //part2
        // put every character in HashSet

        //part3
        // put every character in HashMap<Character, Integer>

        //part4
        // when you are putting check if you have that letter already, if you have, increment value

        //part5
        //print HashMap


//part 1
        //     String sentence = " BECOME A SOFTWARE TESTER IN 6 MONTHS";

//        System.out.println("1. way");
//        for (int i = 0; i < sentence.length(); i++) {
//            System.out.println(sentence.charAt(i));
//        }
//        char[] charArray = sentence.toCharArray();
//        System.out.println("2. way");
//        for (int i = 0; i < charArray.length; i++) {
//            System.out.println(charArray[i]);
//        }
//        System.out.println("3. way");
//        for (char c : charArray) {
//            System.out.println(c);
//        }

        //part2
        // put every character in to one HashSet
        // String sentence = " BECOME A SOFTWARE TESTER IN 6 MONTHS";
//        HashSet<Character> mySet = new HashSet<>();
//        for (int i = 0; i < sentence.length(); i++) {
//            char aChar = sentence.charAt(i);
//            mySet.add(aChar);
//        }
//        System.out.println(mySet);
        //part3
        // put every character in HashMap<Character, Integer>, use value 0
        String str = " BECOME A SOFTWARE TESTER IN 6 MONTHS";
//        HashMap<Character, Integer> myMap = new HashMap<>();
//        for (int i = 0; i < sentence.length(); i++) {
//            char aChar = sentence.charAt(i);
//            myMap.put(aChar, 0);
//        }
//        System.out.println(myMap);
        //HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        HashMap<Character, Integer> myMap = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//            char aChar = s.charAt(i);
//            myMap.put(aChar, 0);
//        }
//        System.out.println(myMap);

        //part 4

//        for (int i = 0; i < s.length(); i++) {
//            if (myMap.containsKey(s.charAt(i))) {
//                System.out.println(myMap.put(s.charAt(i), myMap.get(s.charAt(i)) + 1));
//            } else {
//                System.out.println(myMap);
         char[] ch = str.toCharArray();
         int i=0,j=0;
         for(i=0;i<ch.length;i++)
        {
            int count = 0 ;
            for( j = i+1;j<ch.length;j++)
            {
                if(ch[i] == ch[j] )
                {
                    count++;
                }
            }
            if(count != 0)
            {
                System.out.println(str.charAt(i) + count + " time");
            }



        }


        }


    }











