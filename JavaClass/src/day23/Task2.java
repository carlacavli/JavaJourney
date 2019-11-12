package day23;

public class Task2 {
    public static void main(String[] args) {
        // write a java program that find maximum
        // of three numbers
        int a = 10;
        int b = 20;
        int c = 30;
        if (a >= b && a >= c)
        System.out.println( a + " is the maximum number.");
       else if (b >= a && b >= c)
            System.out.println( b + " is the maximum number.");
        else
            System.out.println( c + " is the maximum number.");

    }
}
