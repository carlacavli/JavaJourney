package Day8;

import java.util.Scanner;

public class IfElse6 {
    public static void main(String[] args) {
        // evaluate result of exam
        // 'A' => excellent
        // 'B' => good
        // 'C' => middle
        // 'D' => PASS
        // "E" => fall
        Scanner scan = new Scanner(System.in);
        System.out.println("evaluate the grades");
        String grade = scan.nextLine();
        //String grade1 = "A";
        // String grade2 = "B";
        // String grade3 = "C";
        //String grade4 = "D";
        //String grade5 ="F";
        // if(grade.equals("A")


        if ("A".equals(grade)) {
            System.out.println("excellent");
        } else if (grade.equals("B")) {
            System.out.println("good");
        }
        else if (grade.equals("C")){
            System.out.println("middle");
        }
        else if (grade.equals("D")){
            System.out.println("pass");
        }
        else if (grade.equals("F")){
            System.out.println( "failing");
        }
    }
}

//TASK 2 : CONTINUE 1 BUT ALSO CHECK FOR B+ , b- , c + , c -
// B + or B or B- => good
// C+ OR C OR C- +> MIDDLE
// else if ( "B-" .equals.grade


