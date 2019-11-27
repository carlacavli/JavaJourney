package Day40;

public class Cat extends Animal {
    public String sound;
    public Cat(int leggs, int speed, String sound ){
        super(leggs, speed);
        this.sound=sound;

        }

    @Override
    public String toString() {
        return "I want to return Cat ToString. here is my sound:" + sound;
    }
}
