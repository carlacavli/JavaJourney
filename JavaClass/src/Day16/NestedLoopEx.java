package Day16;

public class NestedLoopEx {
    public static void main(String[] args) {
        // 1. write program that prints this using loops
        //    *
        //    **
        //    ***
        //    ****
        //    *****
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++){
                System.out.print("*" + " " + "*" );
            }
            System.out.println();
        }

        }
    }

