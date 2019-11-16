package Day32;

import java.util.ArrayList;

// Write a program with a method named getSum
// that accepts ArrayList of integers as an argument and print its sum in main.
public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
       int sum= getsum(list);
        System.out.println(sum);
    }

    private static int getsum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;

        }
        return sum;
    }
}