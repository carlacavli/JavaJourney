package Day8;

import java.util.Scanner;

public class JavaSwitchInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("provide a number");
        int number = scanner.nextInt();


        switch (number){


            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println( "one");
               break;
            case 2:
                System.out.println( "two");
                break;
            case 3:
                System.out.println("tree");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("five");
                break;
            case 6:
                System.out.println("six");
                break;
            case 7:
                System.out.println("seven");
                break;
            case 8:
                System.out.println("eight");
                break;
            case 9:
                System.out.println("nine");
                break;
            case 10:
                System.out.println("ten");
                break;
            default:
                System.out.println(" not providing");
                break;

        }
        // write switch for : 0,1 , 2, 3 4 5 6 7 8 9 10

    }
}
