package day4;

public class day4 {
    public static void main(String[] args) {
        // given two strings, a and b ,
        // return the result of puttinig them together in the order abba,
        //ex ; "Hi" and " Bye " returns "HiByeByeHi".
        //
        String first = "hi";
        String second = "bye";
        makeAbba(first, second);
        System.out.println("HiByeByeHi");

    }


    private static void makeAbba(String first, String second) {
        System.out.println( first + second + second + first);

        // int num1 = 6;
        //int num2 = 3;
        // int result = 6 % 3
        // the result is 0



    }
}
