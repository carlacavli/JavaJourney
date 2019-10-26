package EvdeCalisma1;

import java.util.Scanner;

public class EvdeCalisma2 {
    public static void main(String[] args) {
        String kullaniciadi = "muberra";
        String parola ="1982";
        Scanner scan = new Scanner(System.in);
        System.out.println("kullaniciadi");
        String username =scan.nextLine();
        System.out.println("parola");
        String password = scan.nextLine();

        if((!username.equals(kullaniciadi)) && (! password.equals(parola))){

            System.out.println(" kullanici adi ve parola yanlis");
        }
        else if((! username.equals(kullaniciadi)) && ( password.equals(parola))){
            System.out.println("kullanici adi yanlis");
        }
        else if ((username.equals(kullaniciadi)) && ( ! password.equals(parola))){
            System.out.println("parola yanlis");
        }
        else if((username.equals(kullaniciadi)) && ( password.equals(parola))){
            System.out.println("giris basarili");
        }

    }
}
