package Day11;

import java.util.Scanner;

public class ForEx4 {
    public static void main(String[] args) {
//        int counter = 0;
//        int sum = 0;
//        for(int i = 1; i <= 10; i = i + 3){
//            System.out.println(i);
//            sum += i; // same as sum = sum + i;
//            counter++; // same as counter = counter + 1;
//        }
//
//        System.out.println("sum from 1 to 10 with +3 is " + sum);
//        System.out.println("counter is " + counter);
//
//        System.out.println((double) sum / counter);
//    }
        //task ;write a program with sum up tp you provideed number
        // from 0
        //5
        //0 +1 +2 + 3 + 4 + 5 =>???

        Scanner s = new Scanner(System.in);
        System.out.println("Provide a max number: ");
        int max = s.nextInt();

        int sum = 0;
        int counter=0;

        for(int i = 0; i <= max; i++){
            //your code
            System.out.println(i);
            sum +=i; // sum = sum + i;
            counter++;

        }

        //part 1
        System.out.println("Sum is " + sum);

        //part 2 is to get average
        System.out.println("average is " +((double)sum/counter));
    }

    }

