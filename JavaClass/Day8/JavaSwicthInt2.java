package Day8;


import java.util.Scanner;

public class JavaSwicthInt2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek){
            case 1 :
                System.out.println("one");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
            default:
                System.out.println("not in range");
        }


    }
}
// kodunu nasil tesk edersin derlerse  : farkli data typleri deneyerek
// run yaptigimiz zaman cikan errorler runtime error oluyor
// compile error = kodu yazarken yapilan hatalar run yapiliyor ama sonuc cikmiyor