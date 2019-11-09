package Day21;

import java.util.Scanner;

public class JavaMethods2 {
    //   2. Write a Java method to compute the average of three numbers.
//    Test Data:
//    Input the first number: 25
//    Input the second number: 45
//    Input the third number: 65
//    Expected Output:
//
//    The average value is 45.0

    public static void main(String[] args) {
        getdoubles();
    }

    private static void getdoubles() {
        Scanner in = new Scanner(System.in);
        System.out.print(" first number: ");
        double x = in.nextDouble();
        System.out.print("second number: ");
        double y = in.nextDouble();
        System.out.print("third number: ");
        double z = in.nextDouble();
        System.out.print("The average value is " + average(x, y, z) );
    }

    public static double average(double x, double y, double z)
    {
        return (x + y + z) / 3;
    }
    }

