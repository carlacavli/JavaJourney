package Day19;

import java.util.ArrayList;

//9. Write a Java program to copy one array list into another.
public class ArrayListEx10 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red"); // 0
        list1.add("White");// 1
        list1.add("Black"); // 2
        list1.add("Green");
        System.out.println("List 1: " + list1);

        ArrayList<String> list2 = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));

        }
        System.out.println("list 2: "+ list2);
    }
}
