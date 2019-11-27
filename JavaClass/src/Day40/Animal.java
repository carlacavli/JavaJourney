package Day40;

public class Animal {
    public int leggs;
    public int speed;

    public Animal( int leggs, int speed){
        this.leggs =leggs;
        this.speed = speed;
    }
    @Override
    public String toString(){  // bu overwriting oluyor . ben diger siniflarda bu ozellikleri cagirdigimda tekrar yazmama gerek yok
        return ("leggs of the anmal is "+ leggs + "\n" + "and speed is "+ speed);
    }
    /*
    eger buraya private bisey eklemek isteresk onu constructoin icinde belirtmemiz lazim
    public int speed in altindaki yere mesela private int age yazmak istiyoruz ; public Animal ( buraya int age diye eklersek cikar .
    this.age diyede belirtmemiz lazim.
    overloading de birden fazla consturctor veya method eklersen oluyor.
     */
}
