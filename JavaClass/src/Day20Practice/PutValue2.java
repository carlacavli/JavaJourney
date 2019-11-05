package Day20Practice;

import java.util.HashMap;

public class PutValue2 {
    public static void main(String[] args) {

        String[] names = {"Max", "Drake", "Susan"};
        HashMap<String, Integer> map = new HashMap<>();
        //write you code here
        for(String name :names){
         map.put(name, 0);
        }
        System.out.println(map);
        }
        //end of you code
//        System.out.println(map);
        //output:
        //{"Max"=0,"Drake"=0,"Susan"=0}

    }




