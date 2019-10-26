package JavaClass;

public class Javaclasscomapringstrings {
    public static void main(String[] args) {
        String s1 = "yes";
        String s2 = "yes";

        if (s1 == s2) {
            System.out.println("its equal");
        }

        String s3 = new String("YES");
        String s4 = new String("YES");
        if (s3.equals(s4)) {
            System.out.println(" its equal again");

            String name = "ali";
            if (name.equals("max")) {
                System.out.println("hello");


                String nameofcourse = "ts";
                String otherstring = "ts";
                if (nameofcourse.equals(otherstring)) {
                    System.out.println("you gonna be tester after 6 months");

                }
                //task 1:
                //check if string is equal to your name , print your surname
                //ex; michale => jackson
                String name2 = "muberra";
                String surname = " cavli";
                if (name2.equals("muberra")) {
                    System.out.println(surname);
                }
            }
        }
    }
}


