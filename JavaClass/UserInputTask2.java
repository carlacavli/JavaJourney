package day7;

import java.util.Scanner;

public class UserInputTask2 {
    //check if your number is positive or negative with scanner
    // where number is -200 <= N<= 200
    //ex: -123 => negative
    //ex: 10 => positive
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("provide a number");
        int number = scan.nextInt();

        System.out.println(number);
        if (number < 0) {
            System.out.println("negative");
        }
        if (number > 0) {
            System.out.println("positive");
        }
        if (number == 0){
            System.out.println("its zero");
        }
    }
}
