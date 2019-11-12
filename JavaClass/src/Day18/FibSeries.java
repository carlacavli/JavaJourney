package Day18;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class FibSeries {

    //    Fibonacci Number
//    The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
    public static void main(String[] args) {
        int result = fib(5);
    }
    //1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233
    static int fib(int N) {
        int first = 89;
        int second = 144;
        int fibNum;

        for (int i = 0; i < N; i++) {

            fibNum = first + second;
            first = second;
            second = fibNum;
            System.out.println(fibNum);
        }
        return -1;
    }

    }



