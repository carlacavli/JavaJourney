package Day38.PublicAcces;

import Day38.PublicAcces.Car12;

/*
mesela kumandayi ele alicak olursak ,kumandanin farkli ozellikleri var ve bir cok methodu var
kumandanin tuslari ( acma kapama)kumandanin ozellikleridir , bunlar fields anlamina geliyor oop de
ses acma tusuna bastigimizda sesin acilmasi , kapatma tusuna bastigimizda kapanmasida kumandanin islevleri
yani methodlari oluyor.

 */
public class Main {
    public static void main(String[] args) {
        Car12 car = new Car12();
        car.color="red";
        car.doors=4;
        car.engine=1.2;
        car.model="mercedes";
        System.out.println("color of car"+car.color);

    }
/*

 */
}
