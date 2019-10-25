package Day11;

import java.util.Scanner;

public class ForEx2 {
    public static void main(String[] args) {
        // part 1: write a program which prints even numbers up to 10
        //ex: 0, 2, 4, 6, 8

        // hint:
        // if( x%2 ==0 ) => even
        // else => odd

        for (int i = 0; i <= 10; i = i + 2) { //PART1
           // buda uzun yazma yolu ==> if( i % 2==0){
            System.out.println(i);

        }
        //part2: continue part1 but use scanner to provide maximum loop
        //iteration
        // instead of 10 in part 1 you should use provided number.
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        //part 2;
       Scanner scan= new Scanner(System.in);
        System.out.println("provide max number: ");
        int max=scan.nextInt();
        for (int i = 0; i <= max; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
        System.out.println(">>>>>>>>>>>>>>>>>>>>>");
        //part 3: continue part 2,but also provide starting number

        System.out.println("provide min number: ");
        int min =scan.nextInt();
        for (int i =min; i <=max; i++){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
