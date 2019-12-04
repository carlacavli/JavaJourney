package Day44;
// run time polymorphism..   in the run time decides to go subclass 1 or 2
public class Practice_Oop {
    public static void main(String[] args) {
        Parent p = new Parent();
        p = new SubClass1();
        p.print();

        p = new SubClass2();
        p.print();
    }
}

class Parent {
    void print() {
        System.out.println("ParentClass");
    }
}

class SubClass1 extends Parent {
    void print() {
        System.out.println("Sub Class 1");
    }
}

class SubClass2 extends Parent {
    void print() {
        System.out.println("Sub Class 2");
    }
}