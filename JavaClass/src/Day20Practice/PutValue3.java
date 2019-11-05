package Day20Practice;

import java.util.HashMap;

public class PutValue3 {
    public static void main(String[] args) {
        // Put first names and last names into your map, and print

            String[] firstNames = {"Max", "Drake", "Susan"};
            String[] lastNames = {"Smith", "Jones", "Miller"};
            HashMap<String, String> people = new HashMap<>();
        for (int i = 0; i < firstNames.length; i++) {
            people.put(firstNames[i], lastNames[i]);
        }
         System.out.println(people);

            //write you code here

            //end of you code
            //System.out.println(map);
            //output:
            //{Max=Smith,Drake=Jones,Susan=Miller}
    }
}
