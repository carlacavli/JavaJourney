package Day8;

public class IfElse2 {
    public static void main(String[] args) {
        int num = 19;
        if(num % 2 == 0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
        System.out.println(">>>>>>>>>>>>>>>");

        int num2 = 10;
        if (num2 > 0){
            System.out.println("positive");
        }
        else{
            System.out.println("negative");
        }
        System.out.println("<<<<<<<<<<<<<<<<<<");
        String s1 ="hellooowhehehhe";

        if (s1.length() == 5){
            System.out.println("its have enough lenght");
        }
        else if (s1.contains("o ")){
            System.out.println("it has o");

        }
        else {
            System.out.println("ignore this");
        }
    }
}
