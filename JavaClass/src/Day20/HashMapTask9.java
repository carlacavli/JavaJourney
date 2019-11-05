package Day20;

import java.util.HashMap;
// map teki valueleri bulma

public class HashMapTask9 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
             // key  //value
        map.put(1, "Red");
        map.put(2, "Green");
        map.put(3, "Black");
        map.put(4, "White");
        map.put(5, "Blue");

        System.out.println(map.values());


    }
}
