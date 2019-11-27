package Day36;

public class Task1 {

// create array of size 5
// try to access to index 10

    //
    public static void main(String[] args) {
            int[] numbers = new int[5];

            try {
                System.out.println(numbers[10]);
            }catch (Exception ex){
                System.out.println("Something happened");
            }
        }
    }
