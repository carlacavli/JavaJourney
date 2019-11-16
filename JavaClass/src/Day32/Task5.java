package Day32;



public class Task5 {
    public static void main(String[] args) {

        int number = 3;
        boolean result = isOdd(number);
        if (result = true) {
            System.out.println("ODD");
        } else {
            System.out.println("no");
        }
    }

        public static boolean isOdd ( int number){
            return number % 2 != 0;
        }

    }

