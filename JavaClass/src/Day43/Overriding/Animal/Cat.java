package Day43.Overriding.Animal;

import Day43.Overriding.Animal.Animal;

public class Cat  extends Animal {
    @Override
    public void sound(){
        System.out.println("cat say meow");
    }
    public void sleep(){
        System.out.println("cat sleep");
    }
}
