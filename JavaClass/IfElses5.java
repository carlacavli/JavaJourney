package Day8;

import javax.swing.*;
import java.util.Scanner;

public class IfElses5 {
    public static void main(String[] args) {
        // byte -127 <-> 128
        // write a program check what number datatype it is ?
        // 23 => byte
        // 12312 => int
        // 123123123 => long
        Scanner scan = new Scanner(System.in);
        System.out.println("write a number please");
        long number = scan.nextLong();

        if (number >= -128 && number <= 127){

            System.out.println("datatype is byte");
        }
        else if ( number <= -32768 && number <= 32767){
            System.out.println( "datatype is  short");
        }
        else if ( number <= Integer.MIN_VALUE && number <= Integer.MAX_VALUE){
            System.out.println("datatype is int");
        }
        else if (number >= -92345677887655443L && number <= Long.MAX_VALUE){
            System.out.println( " datatype is long");
        }



    }


}
