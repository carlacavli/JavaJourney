package Day19;

import java.util.ArrayList;

//7. Write a Java program to search an element in a array list.
public class ArrayLIstEx8 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");


        boolean containspurple = colors.contains("purple");
        if (containspurple) {
            System.out.println("\nIt has purple");
        } else {
            System.out.println("\nIt doest have purple");

        }
    }
}
