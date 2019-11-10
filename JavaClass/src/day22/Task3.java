package day22;

public class Task3 {
    public static void main(String[] args) {
      //  Write a Java program to print the grid of zeros with length m and n.
        int m = 2; // 2 column
        int n = 3; // 3 rows

        int [][] array = new int [m][n];
        for (int i = 0; i < array.length; i++) {          //row
            for (int j = 0; j < array[i].length; j++) {  //column
                System.out.print(array[i][j]);

            }
            System.out.println();
            }

        }


    }

