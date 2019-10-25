package day7;

public class MathRandom {
    public static void main(String[] args) {
        //random numbers in java use math.random
        //System.out.println(Math.random());// to print random
        double random = Math.random(); // 0<-> 1
        System.out.println(random);
        System.out.println(">>>>>>>>>>>>>>>");
        // this give us a random number between 0 and "int max "
        int max = 10; // 0 -10
        double r1 = random * max;
        int i1 = (int)r1;
        System.out.println(r1);
        System.out.println(i1);
        // task1; print random number between 0 and 100;
        System.out.println("................");
         int max1 = 100;// declaring integer max with value 10
         double r2 = random * max1;//gets random double between 0 -"max"
         int i2 = (int)r2;// gets integer form double
        System.out.println(r2);// printing double r1
        System.out.println(i2); // printing integer i1
        System.out.println((int)(Math.random() *100));

        //task 2; print 2 random numbers between 0 and 100






    }
}
