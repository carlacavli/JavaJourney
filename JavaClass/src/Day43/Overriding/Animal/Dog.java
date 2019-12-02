package Day43.Overriding.Animal;

import Day43.Overriding.Animal.Animal;

public class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("dog say ......");
    }
    public void run(){
        System.out.println("ring ding");
    }
}