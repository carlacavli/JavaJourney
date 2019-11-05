package Day20;

import java.util.HashMap;
import java.util.Map;

public class HashMapTask11 {
    public static void main(String[] args) {
        //14. print
        // Apple Lemon Peach Melon Berry
        // 100 200 150 145 250

        HashMap<String, Integer> map = new HashMap<>();

              // key    //value
        map.put("Apple", 100);
        map.put("Lemon", 200);
        map.put("Peach", 150);
        map.put("Melon", 145);
        map.put("Berry", 250);
//
//        System.out.println(map.values());
//        System.out.println(map.keySet());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String name = entry.getKey();
            System.out.print(" " + name);

        }
        for (Map.Entry<String, Integer> entry : map.entrySet()){
            Integer point = entry.getValue();
            System.out.print(" " + point);
        }


//        } // hocanin cozumu
//
//        for (String key : map.keySet()) {
//            System.out.print(key + " ");
//        }
//        System.out.println();
//        for (Integer value : map.values()) {
//            System.out.print(value + " ");
//        }
    }
    }

