package Day19;

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class HashSetEx1 {



        public static void main(String[] args) {
            System.out.println("ArrayList------------------------");
            ArrayList<String> myList = new ArrayList<>();
            myList.add("Ali");
            myList.add("Max");
            myList.add("Max");
            System.out.println(myList);

            System.out.println("HashSet------------------------");
            Set<String> mySet = new HashSet<>();
            mySet.add("Ali");
            mySet.add("Max");
            mySet.add("Max");
            System.out.println(mySet);
        }
    }
