package Day43.Overriding.Animal;

import Day43.Overriding.Animal.Animal;
import Day43.Overriding.Animal.Cat;
import Day43.Overriding.Animal.Dog;
import Day43.Overriding.Animal.Fox;

public class Overriding3 {
    public static void main(String[] args) {

    Animal[] animals = new Animal[3];
    animals [0] = new Cat();
    animals [1] = new Dog();
    animals [2] = new Fox();

    for ( Animal animal : animals){
        animal.sound();
        if (animal instanceof Cat){
            ((Cat) animal).sleep();
        }else if ( animal instanceof Dog){
            ((Dog) animal).run();
        }else if ( animal instanceof Fox){
            ((Fox) animal).hunt();
        }
    }

    }
}