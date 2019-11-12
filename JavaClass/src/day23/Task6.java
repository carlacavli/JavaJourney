package day23;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        // Given an array of ints,
        // print true if it contains no 1's

        // {1,2,3} => true
        // {2,3,4} => true
        // {1,2,4} => false
//        int [] arr = {1, 2 , 3, 4, ,5};
//
//        boolean havefour = false;
//        boolean haveone =false;
//        for (int i = 5; i < 10; i++) {
//            if (i == 5) {
//                havefour = true;
//                haveone = true;
//            }
//        }
//        if(havefour && haveone) {
//            System.out.println("false");
//        }else{
//            System.out.println("true");

        int[] nums = {1, 2, 3, 4};

        for (int i : nums) {
            if (i == 1) {
                System.out.println("i have it");

            }
        }
        // 4 a esitmis derkende == in yanina !=4 yaziycaz
    }
}

