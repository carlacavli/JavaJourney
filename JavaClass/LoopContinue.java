package Day12;

public class LoopContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("beginning " + i);
            if (i >= 4) { // 1 2 3 [4 5]
                continue;
            }
            System.out.println("ending " + i);
            System.out.println();
        }
        int number = 0;
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // start from beginning
            }
            System.out.println("Loop iteration: " + i);
        }
        System.out.println("Your number is " + number);

//        for (int i = 1; i <= 5; i++) {
//            System.out.println(">>>>>>>>> " + i);
//            if(i >= 4){
//                continue;
//            }
//            System.out.println("<<<<<<<<< " + i);
//            System.out.println();
//        }
    }
}




