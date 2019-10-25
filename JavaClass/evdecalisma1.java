package EvdeCalisma1;

import java.util.Scanner;

public class evdecalisma1 {
    public static void main(String[] args) {
        String  sysusername = "technostudy";
        String syspassword = "12345";

        Scanner scan = new Scanner(System.in);
        System.out.println( "username");
        String username = scan.nextLine();

        System.out.println("password");
        String password =scan.nextLine();

        if(  !(sysusername.equals(username)) && !(password.equals(syspassword))){
            System.out.println( "username and password is wrong");
        }
        else if ((sysusername.equals(username)) && !(password.equals(syspassword))){
            System.out.println("password is wrong");
        }
        else if (!(sysusername.equals(username)) && (password.equals(syspassword))){
            System.out.println("username is wrong");
        }
        else {
            System.out.println("successful....");
        }


    }
}
