package Day19;

import java.util.ArrayList;
import java.util.HashSet;

public class JavaTreeSetTask {
    public static void main(String[] args) {
        //14. Write a Java program to check if a string in hash set
        // for ex: ["apple", "red", "green"]
        // if there is red => has red
        // else => dont have it


        HashSet<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("blue");
        mySet.add("green");

        if (mySet.contains("red")) {
            System.out.println("has red");
        } else {
            System.out.println("dont have it");
        }
    }
}




