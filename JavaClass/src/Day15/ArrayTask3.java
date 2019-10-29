package Day15;
//TODO Task
// part1. fill array with random values
// part2. print it in reverse order

import java.util.Random;

public class ArrayTask3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int arr[] = new int[10];
        System.out.println("Part 1............");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10);
            System.out.print(arr[i] + " ");

        }
        System.out.println(" \npart 2...............");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");

        }
    }
}
