package Day19;
//remove the 2 element in the arraylist
import java.util.ArrayList;

public class ArrayListEx7 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Green");
        colors.remove(2);
        System.out.println(colors);


    }
}
