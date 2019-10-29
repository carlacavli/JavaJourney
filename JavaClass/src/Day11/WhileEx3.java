package Day11;

import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Write a text: ");
            String line = scanner.nextLine();

            if (line.equals("quit")) {
                break;
            }

            // part1. check for the @,$,* symbols also for a strong password
            // hint: fill if statement with conditions
            if (line.contains("# ") || line.contains("@")) {
                System.out.println("week Password");
            }
            else if(line.contains("@ ,*, %") ||line.contains(" ^ ") ){
                System.out.println(" strong password");
            }
            // part3. check text if it's only uppercase print "use lowercase letters"
            // part4. check text if it's only lowercase print "use uppercase letters"

            String lineUpperCase= line.toUpperCase();
            if(line.equals(lineUpperCase)){
                System.out.println("use lower letters");
            }
            String lineLowerCase=line.toLowerCase();
            if(line.equals(lineLowerCase)){
                System.out.println("use upper letters");
            }
                }

            }

        }



