package Day44.Example;

public abstract class Base {

    public abstract void study();

    //abstract can only have for methods and classes
    //you have to create Derived class that inherits from BaseClass
    //your BaseClass has to have abstract void method called study()
    //Your DerivedClass has to have method called study()
    //when you run the Main method, you have run the study method.

    //Abstract class cannot be instantiated
    public static void main(String[] args) {
        //Base is abstract and cannot be instantiated.
        //BaseClass bc = new BaseClass();//cannot do that, does not compile
        Base d1 = new Derived();
        d1.study();
    }
}
class Derived extends Base {
    @Override
    public void study() {
        System.out.println("Studing Derived");
    }
}


