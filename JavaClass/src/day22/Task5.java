package day22;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {

        //    Write a Java program to remove a specific element from an arrayList.

        ArrayList<String> list = new ArrayList<>();

        list.add("Bill");
        list.add("michelle");

        list.remove(1);

        System.out.println(list);


    }


}