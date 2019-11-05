package Day19;

import java.util.ArrayList;
import java.util.Collections;

//10. Write a Java program to shuffle elements in a array list.
public class ArrayListEx11 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");

        Collections.shuffle(colors);
        System.out.println("shuffled list is:\n" + colors);


        }
    }

