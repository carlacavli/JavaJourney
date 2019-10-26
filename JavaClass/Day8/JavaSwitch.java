package Day8;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" grade ");
        String grade = "A";
        String grade1="B";

        switch (grade){
            case "A":
                System.out.println( "excellent");
                break;
            case "B+":
            case "B_":
            case "B":
                System.out.println("good");
                break;

        }
    }
}
