package Day41.Extra;

public class SubClass extends SuperClass {

    SubClass(int age) {
        super(age);
    }

    public static void main(String[] args) {
        SubClass s = new SubClass(20);
        s.getAge();
    }
}

