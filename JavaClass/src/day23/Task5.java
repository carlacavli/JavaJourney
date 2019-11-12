package day23;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        // Write a Java program to find the second largest element in an array.
//        int abc, size;
//        int array[] = {10, 20, 25, 63, 96, 57};
//        size = array.length;
//        for(int i = 0; i<size; i++ ){
//            for(int j = i+1; j<size; j++){
//
//                if(array[i]>array[j]){
//                    abc = array[i];
//                    array[i] = array[j];
//                    array[j] = abc;
//                }
//            }
//        }
//        System.out.println(" second largest number is:: "+array[size-2]);



        int[] nums = {1, 1000, 34,66};

//        Arrays.sort(nums);
//        System.out.println("second largest "+ nums[nums.length-2]);   //sort yolu ama prefered degil

        int maxFirst = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > maxFirst) {
                maxSecond = maxFirst;
                maxFirst = num;
            } else if (num > maxSecond) {
                maxSecond = num;
            }
        }
        System.out.println("Max:" + maxFirst);
        System.out.println("Max2:" + maxSecond);

    }
        }

