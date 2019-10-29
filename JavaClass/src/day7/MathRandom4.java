package day7;

import javax.swing.*;

public class MathRandom4 {
    public static void main(String[] args) {
        int min = -200;
        int max = 200;
        int range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange);

        //task2 :
        // check if random number is positive or negatie
        //where number is -200<=N <=200
        //EX: -123 => NEGATIVE
        //EX: 10 => positive
        if (randomInRange < 0) {
        }
        System.out.println(" negative");
        if (randomInRange > 0) {
            System.out.println(" positive");
        }
        if (randomInRange == 0) {
            System.out.println("its zero");
        }
        //task 3: check if random number is odd or even
        if (randomInRange > 0) {
            System.out.println("is odd");
        }
         else if (randomInRange > 0) {
        }
        System.out.println(" is even");
    }
}