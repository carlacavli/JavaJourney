package day7;

public class MathRandom2 {
    public static void main(String[] args) {
        //task2 ; print 2 random numbers between 0 and 10;
        // ex; 4
        //     5
        double d1 = Math.random();
        System.out.println( d1);
        System.out.println(d1*10);


        int i1 =( int) (d1 * 10);
        System.out.println(i1);

        System.out.println("..............");
        System.out.println((Math.random()*10));

        System.out.println("/////////////");

        double a = Math.random();
        System.out.println((int)(Math.random()*10)); //bu kolay yolu
        System.out.println((int) (Math.random ()*10));




    }
}
