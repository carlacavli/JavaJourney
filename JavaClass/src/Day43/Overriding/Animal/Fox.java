package Day43.Overriding.Animal;

import Day43.Overriding.Animal.Animal;

public class Fox extends Animal {
    @Override
    public void sound() {
        System.out.println("fox say ????");
    }
   public void hunt(){
       System.out.println("hunting");
   }
}