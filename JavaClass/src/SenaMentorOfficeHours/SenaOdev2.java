package SenaMentorOfficeHours;

import java.util.Arrays;

public class SenaOdev2 {
    public static void main(String[] args) {

        /**
         * Create method that accepts String and returns character array. Input: “James”
         * Output: [j, a, m, e, s]
         *
         *
         */

//
        String word = "Huseyin";

        char[] newArray = characterArray(word);

        System.out.println("newArray = " + Arrays.toString(newArray));
    }

    private static char [] characterArray(String word) {

        String str = "james";
        char [] arr = str.toCharArray();

        for (int i = 0; i <= str.length() - 1; i++) {
            System.out.print(str.charAt(i));
        }
        return arr;

    }

}
