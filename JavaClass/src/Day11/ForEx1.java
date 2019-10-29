package Day11;

import java.util.Scanner;

public class ForEx1 {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("provide a number: ");
//        int num = scan.nextInt();
//        for (int i =1; i <= num; i++){
//            System.out.println(i);
//        }

        //task1 write a program that takes "a " and "B"  numbers
        // from console and show multiplication up to that  "a"number
        //ex: a =3, b=2
        //2
        //4
        //6
        Scanner scan = new Scanner(System.in);
        System.out.println("provide a :");
        int a = scan.nextInt();
        System.out.println("provide b :");
        int b = scan.nextInt();
        for (int i=1; i <=a; i++) {
            System.out.println(i * b);

        }

    }
}

