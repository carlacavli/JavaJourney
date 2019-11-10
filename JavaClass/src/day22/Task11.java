package day22;

public class Task11 {
    public static void main(String[] args) {
        // write a java program that print array in this manner
        // using while loop
        // {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
        //output:
        //  1 10
        //  2 9
        //  3 8
        //  4 7
        //  5 6
        int [] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int i = 0;
        int j = a.length - 1;
        while(i <= 4){
            System.out.println(a[i] + " " + a[j]);
            i++;
            j--;
        }
        }
    }



