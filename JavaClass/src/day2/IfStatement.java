package day2;

import java.io.PrintStream;

public class IfStatement<number, num> {


    public static void main(String[] args) {
        boolean statement = false;

        if (statement) {
            System.out.println("Statement is true");
        }
        int year = 2000;
        if (year >= 2000) {
            System.out.println("It's 20th century ");
        }
        if (year == 2000) {
            System.out.println(" It's millennium");
        }

        if (year < 2000) {
            System.out.println(" It's 19th century");
        }
        int temperature = 10;
        if (temperature >= 70) {
            System.out.println(" It's hot");
        }
        if (temperature < 70 && temperature >= 60) {
            System.out.println(" It's warm");
        }
        if (temperature < 60 && temperature >= 20) {
            System.out.println("Cool");

        }
        if (temperature < 20) {
            System.out.println("Freezing");
        }


        // 1. write a program that checks whether number  is positive or negative
        // ex : 1 => positive
        // ex : -100 => negative
        // hint : N > 0 => positive , N < 0 => negative

        //2. write a program that check whether number
        //  is even or odd
        // ex : 2 => even
        // ex : 3 => odd

        int number = 12312;
        if (number > 0) {
            System.out.println(" it's positive");

        }
        if (number < 0) {
            System.out.println(" it's negative");
        }
        if (number == 0) {
            System.out.println("not psitive neither negative");
        }
        number = 2;
        if (number % 2 == 0) {
            System.out.println("even");
        }
    }

         int num =3; {
         if(num % 2 == 0){

         }
    }




    }




































