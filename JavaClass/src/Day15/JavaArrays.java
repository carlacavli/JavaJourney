package Day15;

public class JavaArrays {


    /**
     * array is a list with predefined length
     * <p>
     * TODO
     * some little knowledge about exceptions, ArrayIndexOutOfBoundsException, NullPointerException
     */


        public static void main(String[] args) {
            int[] array = new int[4];
            array[0] = 1;
            array[1] = 2;
            array[2] = 3;
            array[3] = 4;
//        array[4] = 5; // index out of bounds here

            for (int number : array) {
                System.out.println(number);
            }

            String[] strings = new String[3];

            for (String string : strings) {
                System.out.println(string);
            }

            boolean abc = strings[0].startsWith("abc"); // null pointer here
            System.out.println(abc);

        }



    }

