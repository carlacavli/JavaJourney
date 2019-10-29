package Day16;

public class NestedLoopTask3 {
    public static void main(String[] args) {
        // Write program that prints this using loops
        //    *
        //
        //    ***
        //    ****
        //    *****

            System.out.println("HARD CODED -------------------------");
            System.out.println("*");
            System.out.println("");
            System.out.println("***");
            System.out.println("****");
            System.out.println("*****");

            System.out.println("USING LOOPS ----------------------");
            for (int i = 0; i <= 5; i++) {
                for (int j = 0; j <= 5; j++) {
                    if (j <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print("$");
                    }
                }
                System.out.println();
            }
        }
    }


