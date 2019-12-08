package EvdeCalisma1.Arrays.Examples;

import java.util.Scanner;

public class Example1 {
    public static void ortabulma(int[]arr){
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total+=arr[i];

        }
        System.out.println("ortalama "+ total/arr.length);
        }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int [] arr = new int [6];
        System.out.println("degerleri giriniz");
        for (int i = 0; i <arr.length ; i++) {
           arr[i]= scanner.nextInt();

        }
      ortabulma(arr);
    }
}
