package Day43.Overriding.Animal;

import Day43.Overriding.Animal.Animal;
import Day43.Overriding.Animal.Cat;

public class Overriding2 {
    public static void main(String[] args) {

        Animal animal = new Cat();
        animal.sound();
        ((Cat) animal).sleep();    //sleep methodu cagirmak icin cat e sleep methodu yazmistik onu cagirdik ama cat i parantez
                                  // icinde belirtmemiz lazim.


    }
}

