package Day20;

import java.util.HashMap;

public class HashMapTask5 {
    public static void main(String[] args) {
        //5. Write a Java program to check whether a map
        //   contains key-value mappings (empty) or not.
        //ex: do we have key 3, print => Black,
        //                 else print => No we don't have

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println("Size of map is: " + map.size());

        if (map.containsKey(1)){
            System.out.println("value is " + map.get(1));
        }else{
            System.out.println("no we dont have");
        }
        // part 2 , check if your map is emty
        if(map.isEmpty()){
            System.out.println("is empty");
        }else{
            System.out.println("its not");
        }
      }

    }

