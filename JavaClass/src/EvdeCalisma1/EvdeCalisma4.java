package EvdeCalisma1;

import java.util.Scanner;

// task 1, check pin, pin should be 4 digit number
// if it is not 4 digit number, print "incorrect pin"
// hint: 999 < PIN < 10000
// ex: 13123 => "incorrect pin"

// ex: 13123 => "incorrect pin"



public class EvdeCalisma4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pin;
        do {
            System.out.println("please write pin");
            pin = scan.nextLine();
            //write you code here lenghtini check yap dedigi icin asagidaki if
            if (pin.length() != 4) {
                System.out.println("incorrect pin");
            }

        } while ( pin.equals("9999"));
        System.out.println("Take your card, please");
    }

    }










//        Scanner scan = new Scanner(System.in);
//
//
//        int pin = 9999;
//        do {
//            System.out.println("Write your PIN: ");
//            pin = scan.nextInt();
//            if( (pin<999) ||(pin>10000)){
//                System.out.println("incorrect pin");
//
//            }
//
//        } while (pin != 9999);
//        System.out.println("Take your card");


        // ******* asagidakide hocanin yazdigi kod
//    int pin;
//        do {
//                System.out.println("please write pin");
//                pin = scan.nextInt();
//
//                if (pin <= 999 || 10000 <= pin) {
//                // 123 => 999
//                // 1233 => 10000
//                /// 9999 + 1 => 10000
//
//                System.out.println("Wrong combination, please use a 4 digit number");
//                }
//                } while (pin != 9999);
//
//                System.out.println("take your card")





