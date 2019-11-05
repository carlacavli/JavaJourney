package Day19;

import java.util.ArrayList;
import java.util.Set;

public class JavaSetTask1 {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified
        // element to the end of a hash set.
        // ex: [1, 2 , 3] you add 10 => [1, 2, 3, 10]
        // part 2 : add number 5 five times

        System.out.println("HashSet------------------------");
        Set<Integer> numbers = new java.util.HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);

        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers);
    }
}



