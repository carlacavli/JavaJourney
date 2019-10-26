package Day15;

import java.util.Arrays;

public class ArraysHomework {
    public static void main(String[] args) {
        //Task 1. write a for loop that finds an maximum for the array
        //Task 2. write a for loop that finds an minimum for the array
        //Task 3. write a for loop that finds an average for the array
        // int[] myArray = {34,5,6,2,3,78,1}
        //OUTPUT: average: (34+5+6+2+3+78+1)/7


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
