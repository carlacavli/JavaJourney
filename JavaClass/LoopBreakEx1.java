package Day12;

import java.util.Random;

public class LoopBreakEx1 {
    public static void main(String[] args) {
        // part1, run loop up to 100000000,
        // and exit that loop when i is equal to 232558

        // part2, continue part1, but instead of 232558 use some random number
        // using random generator, Math.random, Random

        //task 1 ;

//          int number = -1;
//            for (int i = 0; i <= 100000000; i++) {
//                System.out.println(i);
//                if (i == 232558) {
//                    System.out.println("----------------");
//                    number = i;
//                    break;
//                }
//            }
//            System.out.println("Your number is " + number);
        // part2, continue part1, but instead of 232558 use some random number
        // using random generator, Math.random, Random

//    // there are several ways to create random number
//    // 1. way:
//    Random rand = new Random();
//    int someRandomNumber = rand.nextInt(100000000);
//    // 2. way:
//    int someRandomNumber1 = (int)(Math.random() * 100000000);
//    //
        //task 2;

            Random rand = new Random();
            int someRandomNumber = rand.nextInt(100);

            int number = -1;
            for (int i = 0; i <= 100; i++) {
                System.out.println(i);
                if (i == someRandomNumber) {
                    System.out.println("----------------");
                    number = i;
                    break;
                }
            }
            System.out.println("Your number is " + number);
        }
        }


