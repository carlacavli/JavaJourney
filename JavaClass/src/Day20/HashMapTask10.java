package Day20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapTask10 {
    public static void main(String[] args) {

        //13. calculate sum of items,
        //  size of map should be at least 5
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Avacado", 150);
        map.put("Banana", 250);
        map.put("Orange", 550);
        int sum = 0;

        for (int value : map.values()) {
            sum += value;
        }
        System.out.println("Sum items " + sum);
    }

        }




