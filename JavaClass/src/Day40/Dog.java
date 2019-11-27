package Day40;

public class Dog extends Animal{
    public String sound;
    public Dog(int leggs, int speed ,String sound) {
        super(leggs, speed);
        this.sound=sound;
        // dog a overite koymadigimiz icin basedeki sinifin overritini cagirir
        // ama cat e koymustuk o zaman cat e gidip onunkini cagiriyor basedekini ignore ediyor.
    }
}
