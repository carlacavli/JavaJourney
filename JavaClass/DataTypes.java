package day3;

public class DataTypes {
    public static void main(String[] args) {
        int myNumber = 9;
        float myFloatnum = 883.34f;
        char myLetter = 'a';
        boolean myBool = false; // true false

        byte minByte = -128;
        byte maxByte = 127;
        int minInteger = -2147483648; //-something ------something
        int maxInteger = 1247483647; // -something ------something
        // 2147483648
        long larger = maxInteger + 1L; // 2147483647 + 1L
        System.out.println(maxInteger + 1);

        //int a = 2147483647;
       // int b = 2147483647;
       // System.out.println(a + b);

        int A = 10;
        int B = 3;
        // float result = a /b ;
        // result = 10 / 3 => 3
       // float result =  (float)  a / ( float) b;
        //result 10.0 / 3.0 => 3.33333333
       // System.out.println(result);
        //task 1. divide a and b , print result
        // hint : Long result = ( Long )a + ( long ) b;


        // task 2 .
        // declare three integers and print average :
        // a, b, c ( a = 123, b = 323, c = 34584)
        // output:
        // ( a+b+c ) / 3 = ???

        //int a = 123;
        //int b = 323;
       // int c = 34584;
       // System.out.println( a + b + c / 3);


        //task 3
        // do some math, get average of several numbers
        // ex : 23.4, 24.0, 12, 450.3, 123000.234
        double a = 23.4;
        double b = 24.0;
        int c = 12;
        double d = 450.3;
        double e = 123000.234;
        System.out.println( a + b + c + d + e);

    }
}
