package day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task7 {
    public static void main(String[] args) {
        // Write a Java program to convert an array to ArrayList
//        List<String> list = new ArrayList<String>();
//        list.add("carla");
//        list.add("cavli");
//        String[] array = new String[list.size()];
//        list.toArray(array);
//        System.out.println(Arrays.toString(array));

        String[] names = {"yasin", "kemal", "suna", "nalan"};

        //1.way
//        List<String> nameList = Arrays.asList(names);
//        System.out.println(nameList);
//        nameList.remove("yasin");
//        System.out.println(nameList);

        //2.way
        ArrayList<String> nameList = new ArrayList<>();
        System.out.println(nameList);
        for(String s : names){
            nameList.add(s);
        }
        System.out.println(nameList);
    }
    }

