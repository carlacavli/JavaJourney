package Day24_ClassesAndAttributes;

public class MyClass {
    int x = 5;
    int y;
    int z = 45;

    final int a = 42;

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.y = 42;
        obj.z = 2;
       // obj.a = 45; // will generate an error: cannot assign a value to a final variable

        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.z);
        System.out.println(obj.a);
    }

}


