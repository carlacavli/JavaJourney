package Day19;
//Write a Java program to test a hash set is empty or not.
import java.util.HashSet;

public class JavaSetTask5 {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        System.out.println(numbers.isEmpty());
        //part 2 if its empty print "its empty
        // else print numbers in set
        if (numbers.isEmpty()) {
            System.out.println("set is  empty");
        } else {
            System.out.println(numbers);

        }
    }
}
