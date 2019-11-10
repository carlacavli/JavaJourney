package day22;

public class Task10 {
    public static void main(String[] args) {
        //write a java program that iterates in reverse order on
        // an array using while-loop

        int[] intArray = {100, 2, 4, 5, 6, 7, 8, 9, 10};

        // ex. output:
        // 10 9 8 7 6 5 4 2 100
        int k = intArray.length - 1;
        while (k >= 0) {
            System.out.print(intArray[k] + " ");
            k--;
        }
        }
    }


