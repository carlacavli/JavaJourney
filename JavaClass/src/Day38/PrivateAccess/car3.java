package Day38.PrivateAccess;
/*
encapsulation yapmanin sebebi bir baskasi erismek istese ve degisiklik yapmak istese
yapabiliyor ama private yaparsak encupsulationi baska bir calisan degeri degisemez kontrol edebiliriz.
eger herhangi bir degisiklik yaptiginda biri mesaj gondermek istiyorsak kontrol altina almak istiyorsak if kullanip
kontrol altina alabiliriz.ozelliklerimize koruma yapmis oluyoruz.

 */
public class car3 {
    private String model;
    private String color;
    private int doors;
    private double engine;

    public car3(String color, String model, double engine,int doors){  //constructor bu
        this. color= color;
        this.model= model;
        this.doors=doors;
        this.engine=engine;
    }

    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }

    public void setDoors(int doors){
        this.doors=doors;
    }
    public int getDoors(){
        return doors;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setEngine(double engine){
        this.engine=engine;
    }
    public double getEngine(){
        return engine;
    }
    public void printInfo(){
        System.out.println(this.color);
        System.out.println(this.model);
        System.out.println(this.doors);
        System.out.println(this.engine);

    }
}
