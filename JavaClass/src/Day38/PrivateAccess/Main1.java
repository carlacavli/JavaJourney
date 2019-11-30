package Day38.PrivateAccess;

public class Main1 {
    public static void main(String[] args) {
// consturctor olusturmak istersem car3 classinda burda new car3 yazan yerde hata cikiyor
// cunku bu bilgileri constructirin(car3 classinin icinde) icinde verdik. new car() icine yazicaz.

        car3 car2 = new car3("black","mercedes",1.6,4);   // bu consturctordan geliyor.
        car2.printInfo();
        /*
        car2.setColor("black");
        car2.setDoors(4);
        car2.setEngine(1.6);
        car2.setModel("mercedes");
        */
//        System.out.println(car2.getColor());
//        System.out.println(car2.getDoors());
//        System.out.println(car2.getEngine());
//        System.out.println(car2.getModel());
    }
}