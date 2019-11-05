package Day20Practice;

import java.util.HashMap;
import java.util.stream.DoubleStream;

public class concatinateValue {
    public static void main(String[] args) {
        // Given map, concatenate map values each time of iteration


            HashMap<String, String> map = new HashMap<>();
            map.put("A", "b");

            for (int i = 0; i < 3; i++) {
                System.out.println(map);
                String value = map.get("A");
                map.put("A", value + "b" );
                //end of you code
            }
            //output:
            // {"A"="b"}
            // {"A"="bb"}
            // {"A"="bbb"}
        }
    }

