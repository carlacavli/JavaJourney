package Day20;

import java.util.*;

public class HashMapTask13 {
    public static void main(String[] args) {
        //16. given map, print it like this:
        // Lemon 200
        // Apple 100
        //1. use TreeMap, and reverse it
        TreeMap<String, Integer> t1 = new TreeMap<>(Collections.reverseOrder());
        t1.put("Apple", 100);
        t1.put("Lemon", 200);
        for (Map.Entry m : t1.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }

        //my approach 1
        //1. use treeMap
        //2. put into 2D array as key-value
        //3. print it in reverse

        //my approach 2
        //1. use treeMap
        //2. put key in list and value in list
        //3. reverse lists
        //4. print lists
        }
        }



