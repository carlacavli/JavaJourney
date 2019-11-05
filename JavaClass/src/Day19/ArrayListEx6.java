package Day19;

import java.util.ArrayList;

public class ArrayListEx6 {
    public static void main(String[] args) {

        //5. Write a Java program to update specific array element by given element.
            //Hint:
            // Black => Blue
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");

        colors.set(2,"Blue");
        System.out.println(colors);
    }
}