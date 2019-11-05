package Day20;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMapTask1 {
    public static void main(String[] args) {


        HashMap<String, Character> map = new HashMap<>();
        map.put("pablo", 'A');
        map.put("latte", 'B');


        for (Map.Entry<String, Character> entry : map.entrySet()) {
            String name = entry.getKey();
            Character point = entry.getValue();
            System.out.println(name + " " + point);


        }
    }
}
