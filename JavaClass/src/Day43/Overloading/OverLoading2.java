package Day43.Overloading;

public class OverLoading2 {
    void sum(short a, short b) {
        System.out.println("a method invoked");
    }

    void sum(int a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String args[]) {
        OverLoading2 obj = new OverLoading2();
        obj.sum(20, 20); //now ambiguity
        //1. way to class sum method with short
        short a = 20, b = 20;
        obj.sum(a, b);
        //2. way to class sum method with short
        obj.sum((short) 20, (short) 20);
    }

}

