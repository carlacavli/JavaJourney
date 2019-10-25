package Day11;

public class ForLopp2 {
    public static void main(String[] args) {
        System.out.println("Example with multiple  declarations,initialiazations and update expressions");

        for (int i = 0, j = 1, k = 2; i <= 10 && j <= 11 && k <= 12; i++, j = j + 2, k = j + 3) {
            System.out.print("i=" + i);
            System.out.print(" j=" + j);
            System.out.print(" k=" + k);

            System.out.println();
        }
        }
    }

