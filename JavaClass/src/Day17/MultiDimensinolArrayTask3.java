package Day17;

import java.util.Arrays;

//part1. print
// apple lemon peach
// red green blue
//part2, you have to USE 2 LOOP and print:
// red green blue
// apple lemon peach
//part3, you have to USE 2 LOOP and print
// red apple
// green lemon
// blue peach
public class MultiDimensinolArrayTask3 {
    public static void main(String[] args) {
        //part 1 ;

        String[][] array = {
                {"apple", "lemon", "peach"},
                {"red", "green", "blue"}
        };
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j]  + " ");
//
//            }
//
//            System.out.println("......");

        //part 2
//
//        for (int i = array.length - 1; i >= 0; i--) {
//
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
        //part 3

        for (int loop1 = 0; loop1 <=2; loop1++) {
            for (int loop2 = 0; loop2 <=1 ; loop2++) {
                System.out.print(array[loop2][loop1] + " ");

            }
            System.out.println();
        }
            }

        }



