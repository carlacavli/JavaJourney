package Day12;

public class LoopcontinueTask1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Start of iteration " + i);

            //TODO if number is even continue
            //     else print that number
            //ex: 3 => print "number is 3"
            //ex: 2 => continue;
            //Hint: i%2==0 => even

            //write you code here
            //you code goes here
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println("number is " + i);
            }

            //end of you code
            System.out.println("End of iteration " + i);
        }
    }
}
