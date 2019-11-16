package Day32;

public class Task6 {
    //   Write a String method called firstHalf,
    //    which takes an String as input and returns first half

    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

        int start = 0;
        int middle = text.length()/2;

        String firstHalf = text.substring(start, middle);
        String secondHalf = text.substring(middle);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }

    public static  String firstHalfSecondHalf(String text) {

            text = text.substring(text.length()/2);
            return text;
        }
    }



