package day7;

import java.util.Scanner;

public class MathRandom6 {
    public static void main(String[] args) {
        //task4. write a program that sums 2 random integer numbers,
        // ex: a = 10 , b = 20
        // a+b = ???
        Scanner scan= new Scanner(System.in);

        int a = (int)(Math.random()+10);
        int b = (int)(Math.random() + 100);

        System.out.println(a);
        System.out.println(b);
        System.out.println(a+ b);
    }
}
