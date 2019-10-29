package Day8;

import java.util.Scanner;

public class IfElse4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // WRITE A PROGRAM  that print temperature in human readebla words
        // ex: 70 => is hot

        int temperature = scan.nextInt();
        if (temperature  >= 70) {
            System.out.println("hot");

            }
        else if ( temperature < 70  && temperature >=50){
            System.out.println( "warm");
        }
        else if (temperature > 70 && temperature >= 20){
            System.out.println("cold");
        }
        else{
            System.out.println(" freezing");
        }
    }
}
