package Day20;

import java.util.HashMap;
// 10. write java program to get the value of a specified key in map

public class HashMapTask7 {
    public static void main(String[] args) {


        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Lemon");
        map.put(3, "Peach");
        map.put(4, "Avocado");
        map.put(5, "Pineapple");

        System.out.println("key 1 is : " + map.get(1));

    }
}
