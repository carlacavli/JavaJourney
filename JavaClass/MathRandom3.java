package day7;

public class MathRandom3 {
    public static void main(String[] args) {
        int min = 0;
        int max = 3;
        int range = max - min;
        int randomInrage = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInrage);


        if (randomInrage == 0) ;{
            System.out.println("zero");
        }
        if (randomInrage == 3) ;{
            System.out.println( "three");


            // 1. write a program that prints word representation of random number N
            // WHERE NUMBER IS 0 <== N <== 3
            // EX; 0  => zero
            // ex : 3 => three


        }
    }
}
