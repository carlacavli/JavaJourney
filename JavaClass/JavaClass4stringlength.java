package JavaClass;

public class JavaClass4stringlength {
    public static void main(String[] args) {
        //string lenght
        String s1 = " ABCDE";
        System.out.println( s1.length());

        int length = s1.length();
        System.out.println( length);
        String username = "techno.study";

        if(username.length() < 10){
            System.out.println( "you can login");
        }
        if(username .length() >10) {
            System.out.println( "you cannot login");
        }
        //task 1; write a program that sums two strings lenght
        //ex; "abc","z" => 3=1 =>
        //output ; "length is 4"
        String X = "ABC";
        String Y = "Z";
        System.out.println( "lenght is " + (X + Y).length());

        int lenghtX = X.length();
        int lenghtY = Y.length();
        int sum = lenghtX + lenghtY;
        System.out.println("lenght is " + sum);

        // TASK 2 ; write a program that check if the subtraction of s1 and s2 is lenght()
        //less than 0,
        // if it is less print " can not proceed",
        // else " we can do it "
        // ex1 ; s1= "LongStringhere", s2= "ShortOne" => "we can do it
        // ex 2 ; s1 = "short", s2="lonnnnnng"
        //=> "can not proceed "
         String a1 = "longStringhere";
         String b2= "Shortone";


         if (a1.length() - b2.length() <0) {
             System.out.println(" can not proceed");
         }
          if (a1.length() + b2.length() >0)   {
              System.out.println( " we can do it");
          }
         }

        }






