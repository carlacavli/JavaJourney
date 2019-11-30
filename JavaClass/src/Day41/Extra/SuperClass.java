package Day41.Extra;
/*
      The program given in this section demonstrates how to use the super keyword to invoke the parametrized constructor of the superclass.
        This program contains a superclass and a subclass, where the superclass contains a parameterized constructor which accepts a integer value,
        and we used the super keyword to invoke the parameterized constructor of the superclass.

 */
public class SuperClass {
    int age ;
    SuperClass(int age){
        this.age= age;
    }
    public void getAge() {
        System.out.println("The value of the variable named age in super class is: " +age);
    }
}

