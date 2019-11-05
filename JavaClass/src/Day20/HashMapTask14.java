package Day20;

import java.util.HashMap;

// given map, update the values
// apple 333
//lemon 444
public class HashMapTask14 {
    public static void main(String[] args) {
       HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 100);
        map.put("Lemon", 200);
        System.out.println(map);
        map.put("Apple", 333);
        map.put("Lemon", 444);
        System.out.println(map);

//part2. suppose you have large map, and you need to check
        // if you have "Apple" there, if you have apple, only then change
        // its value to 500


        if(map.containsKey("Apple")){
            map.put("Apple", 500);
        }
        System.out.println(map);

    }

        }



