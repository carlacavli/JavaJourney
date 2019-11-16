package Day32;

import java.util.ArrayList;

// Write a program with a method named printAverage
// that accepts ArrayList of integers as an argument and print its average.
public class Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        printAverage(list);
    }

    private static void printAverage(ArrayList<Integer> list) {
        int total = 0;
        for (Integer integer : list) {
            total += integer;

        }
        System.out.println(total);

        double avg = (double) total / list.size();
        System.out.println("The average is " + avg);
    }
}


