package day7;

public class MathRandom5 {
    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        int range = max - min;
        int randomInRange = min + (int) (Math.random() * (range + 1));
        System.out.println(randomInRange);

    }
}
