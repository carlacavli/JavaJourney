package Day43.Overriding.Animal;

import Day43.Overriding.Animal.Animal;
import Day43.Overriding.Animal.Cat;
import Day43.Overriding.Animal.Dog;
import Day43.Overriding.Animal.Fox;

public class Overriding {
    public static void main(String[] args) {
        Animal a = new Animal();
        Cat c = new Cat();
        Dog d = new Dog();
        Fox f = new Fox();

        f.sound();
        a.sound();
        c.sound();
        d.sound();

        // kodu kisaltmak icin hepsini tek tek yazmak yerine arraysin icine koyabiliriz
        System.out.println("..............");
        Animal [] animals = {new Cat(), new Dog(), new Fox()};
        for(Animal animal : animals){
            animal.sound();
        }
    }

}
