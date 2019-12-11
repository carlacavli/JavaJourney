package Day48;

public class Dog  implements Animal {
    private String breed;
    private double minCal;
    private double maxCal;

    public Dog() {
    }

    public Dog(String breed, double minCal, double maxCal) {
        this.breed = breed;
        this.minCal = minCal;
        this.maxCal = maxCal;
    }


    @Override
    public void sound() {
        System.out.println("bark bark");
    }

    @Override
    public void feed(Food food) {
        if (food instanceof DogFood) {
            if (food.getCal() < minCal) {
                System.out.println("Still hungry!!! uuuu");
            } else if (food.getCal() > maxCal) {
                System.out.println("Over eating, fat dog");
            } else {
                System.out.println("Healthy dog, good boy");
            }
        } else {
            System.out.println("Feeding wrong food!!");
        }

        //if statements
        System.out.println(food.getName() + " - " + food.getCal());
    }
}