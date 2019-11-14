package day24;

public class Example {
   static int x = 5;   //staticlerin icine yazarken static olmasi lazim basinda ama static olmassa method yazabilirsin
   int y = 6;
   int z = 6;
    public static void main(String[] args) {
        Example ex2 = new Example();
        Example ex3 = new Example();

        System.out.println(ex2.x);
        System.out.println(ex3.y);
        System.out.println(ex2.z);
        x=5;


        TechnoStudyMethod();
//        TechnoStudyMethod2();
    }

    public void PublicMethod() {
        System.out.println("print something");
        x = 5;
        y = 6;
        z = 6;
    }

    public static void TechnoStudyMethod() {
        System.out.println("print here");
    }

        }






