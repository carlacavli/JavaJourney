package Classroomstudy1;

import java.util.Scanner;

public class study1 {
    public static void main(String[] args) {


        //revert demek ssildigin kodlari programi geri almak demek
        Scanner scan = new Scanner(System.in);
        System.out.println("number: ");
        int number = scan.nextInt();
        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("fizzbuzz");
        else if (number % 5 == 0)
            System.out.println("fizz");
        else if (number % 3 == 0) ;
        System.out.println("buzz");

    }
}