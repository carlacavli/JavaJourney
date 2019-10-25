package day7;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
                //scan yazdi ama o sadece isim ne istersen yazabilirsin
        //System.out.print("enter your name: ");

       // String name = scan.nextLine(); //naame:"max"
       // System.out.print("welcome " + name + "!!!");

       // System.out.println("..............");
       // String s1 = scan.nextLine();
        //System.out.println("your text is: " + s1);

       // int i1 = scan.nextInt();
       // System.out.println("integer is : " + i1);

        //to do task1 ; write a program that ask a number;
        // in your console it should print same as below;
        //provide a number;
        //3
        // your number is 3

        System.out.println("provide a number:");
        int first= scan.nextInt();

        System.out.println("your number is " +first);


        //task2 : rite a program that ask two number;
        //        // in your console it should print same as below;
        //        //provide a  first number;
        //        //3
        // yur first number is 3
        // provide a second nmber;
        //5
        //your second number is 5

        System.out.println("provide a second number:");
        int second = scan.nextInt();

        System.out.println( "your second number is:" + second);

        //task3:continue task2 print sum of two numbers
        // final line of you console should be like this; sum is 8

        int sum = first + second;
        System.out.println(first + second);


    }
}
