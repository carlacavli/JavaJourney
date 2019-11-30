package Day41.Extra;


    public class My_Calculation extends Calculation {
        public void multiplication(int x, int y) {
            z = x * y;
            System.out.println("The product of the given numbers:"+z);
        }

        public static void main(String args[]) {
            int a = 20, b = 10;
            My_Calculation demo = new My_Calculation();
            demo.addition(a, b);
            demo.Subtraction(a, b);
            demo.multiplication(a, b);
        }
    }
/*
        A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members,
        so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.

 */