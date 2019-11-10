package day22;

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        //Write a Java program to sort a numeric array and a string array.
        int [] array1 = {1,2,4,10,2,0};
        String[] array2 = new String[]{"Zeynep", "Serkan", "Bayram"};
        System.out.println("First int array : "+Arrays.toString(array1));
        Arrays.sort(array1);
        System.out.println("Sorted int array : "+Arrays.toString(array1));

        System.out.println("First String array : "+Arrays.toString(array2));
        Arrays.sort(array2);
        System.out.println("Sorted String array : "+ Arrays.toString(array2));

    }
}
