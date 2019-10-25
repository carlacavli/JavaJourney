package day7;

import java.util.Scanner;

public class Usereinputtaskks {
    public static void main(String[] args) {
        //task 2 : write a program that prints number of word representation number
        //where number is 0 <= N <= 3
        //ex: zero => 0
        //one => 1
        Scanner scan = new Scanner(System.in);
        System.out.println( "provide a number [0 - 3] : ");
        String s1 = scan.nextLine();
        if ( s1.equals("zero")){
            System.out.println(0);
        }
        if( s1.equals("one")){
            System.out.println(1);
        }
        if (s1.equals("two")){
            System.out.println(2);
        }
        if (s1.equals( "tree")){
            System.out.println(3);
       }
        }
    }

