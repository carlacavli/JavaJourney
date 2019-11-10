package day22;

public class Task4 {
    public static void main(String[] args) {
        //. Write a Java program to test if an array contains a specific value
        int[] num = {1, 2, 3, 4, 5};
        int Find = 3;
        boolean found = false;
        for (int n : num) {
            if (n == Find) {
                found = true;

            }
        }
        if(found)
            System.out.println(Find + " is found.");
        else
            System.out.println(Find + " is not found.");


        //hocanin yaptigi
//        int[] arr = {1, 23, 34, 45, 34, 645, 6, 45};
//        for (int num : arr) { // for-each loop
//            if(num == 6){
//                System.out.println("I have it");
//            }
        }
    }

