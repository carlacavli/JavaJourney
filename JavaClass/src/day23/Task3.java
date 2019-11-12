package day23;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        //    Write a Java program to find the largest element in an array.
       // {1,34,66,1000,23,4,7,9} => 1000

        int a[] = {1,34,66,1000,23,4,7,9};
         Arrays.sort(a);

        int max= a[a.length-1];
        System.out.println(max);


    }
}
