package EvdeCalisma1;

import java.util.Arrays;

public class EvdeCalismaArrays5 {
    public static void main(String[] args) {
//        double grades[] = {96.5, 96.7, 88.5, 80.1, 70.4, 99.9};
//        double max;
//        max = grades[0];
//        int i;
//        for (i = 0; i <= 5; i++)
//        {
//            if (grades[i] > max) max = grades[i];
//        }
//        System.out.println("the max grades in the class is : " + max);
//
//        int [] numbers = new int[3];
//        numbers [0] = 1;
//        numbers [1]= 4;
//        numbers [2]= 5;
//        System.out.println(Arrays.toString(numbers));
//



//task 1 ,2 ,3 :
        int [] arr ={4,6,8,34,55,};
        int max = arr[0];
        int min =arr[0];
        int average  = arr[0]/arr.length;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] > max )
                max = arr[i];
            if (arr[i] < min)
                min = arr[i];
            average = arr[i] / arr.length;

        }
        System.out.println( "max is: " +max);
        System.out.println("min is : " + min);
        System.out.println("average is : " + average);
    }




    }

