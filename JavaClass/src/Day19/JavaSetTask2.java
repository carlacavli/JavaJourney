package Day19;

import java.util.HashSet;

public class JavaSetTask2 {
    public static void main(String[] args) {
        //2. Write a Java program to iterate through all elements in a hash list.

            HashSet<Integer> numbers = new HashSet<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(10);

            System.out.println(numbers);
        for (Integer setNumber : numbers) {
            System.out.println(setNumber);

        }
    }
}
