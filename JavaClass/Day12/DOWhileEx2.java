package Day12;

import java.util.Scanner;

public class DOWhileEx2 {
    public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int pin = 9999;
            do {
                System.out.println("WRITE YOUR PIN:");
                pin = scan.nextInt();
            }while (pin != 9999);

// do ilk kod while deki condition yanlis oldugu surece


            System.out.println("Take you card");
        }
    }

