package Day40;

public class MountainBike extends Bicyle {
    public int height; // bunu yeni ekledik bicyle classinda olmayan birsey
    public MountainBike(int gear, int speed) { // EGER BU SINIF ABASKA YENI BISEY EKLEMEK ISTERSEM , CONSTURCTORUN ICINE YAZIYORUM
        super(gear, speed);
        this.height=height; // burdada yeni ekledigimiz seyi belirtmemiz lazim
    }
}
