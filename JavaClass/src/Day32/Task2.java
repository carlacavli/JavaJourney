package Day32;
// Write a program with a method named printSum
// that accepts ArrayList of integers as an argument and print its sum.
// iki tane arraylist yaptik , istersen 3 te yapabilirsin

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        printSum(list);


        ArrayList<Integer> mysecondlist = new ArrayList<>();
        mysecondlist.add(4);
        mysecondlist.add(46);
        mysecondlist.add(5);
        printSum(mysecondlist);

    }

    public static void printSum(ArrayList<Integer> numbers){
        int sum=0;
        for (int num : numbers) {
            sum+=num;

        }
        System.out.println(sum);
    }
}
