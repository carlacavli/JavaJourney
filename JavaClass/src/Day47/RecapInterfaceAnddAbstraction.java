package Day47;

public class RecapInterfaceAnddAbstraction {
/*
Abstract sınıflar içerisinde normal yani içi dolu metodların,değişkenlerin ve interface’lerdeki
gibi abstract (boş) metodların tanımlanabildiği
yapılardır.Bu sınıflar new kelimesi ile oluşturulamazlar.

abstract classlarda ortak ozellikleri kullanabiliyoruz ama mesela fish ucamaz eger animal classin icinde fly diye bit method varsa bunun icin
interface yapmamiz lazim.interfacede  bir cok classi extend yapabiliyosun yani  ekleyebiliyosun . implements dealing with the interfaces
differrent actionsu cagirmaya yariyor interface.
Interface’ler de Abstract sınıflar gibi new ile oluşturulamazlar
İçi dolu metod bulunduramazlar
public static final değişkenler dışında herhangi bir değişken bulunduramazlar
Bir sınıf birden fazla interface’den türeyebilir
abstraction and interface better when you want some more actions o zamAN GEREKIYOR.BIRDEN FAZLA SEYIN OZELLIGNI CAGIRMAMIZ ICIN
INETRFACE CLASSLAR YAPIYORUZ,.BUTUN METODLARI TEKRARDAN KULLANMAN GEREKEBILIR AMA INTERFACELE YAPABILIRSIN
//////////////////////////////
Java “implements”, “interface” uygulamak için kullanılan terimdir. Yerine getirmek, uygulamak anlamında kullanılmaktadır.
 “Interface” sınıfında belirtilen metotları kullanacağımızı belirtmiş oluruz
 ve bu “interface” sınıfında tanımlanmış olan metotları kullanmak zorundayızdır.


class Araba{
    private int agirlik;
    private String renk;
    private String model;

    public int getAgirlik() {
        return agirlik;
    }
    public void setAgirlik(int agirlik) {
        this.agirlik = agirlik;
    }
    public String getRenk() {
        return renk;
    }
    public void setRenk(String renk) {
        this.renk = renk;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
}

class Mercedes extends Araba{
    private int cantKalinligi;

    public int getCantKalinligi() {
        return cantKalinligi;
    }
    public void setCantKalinligi(int cantKalinligi) {
        this.cantKalinligi = cantKalinligi;
    }
}

class Ford extends Araba{
    private int devirSayisi;

    public int getDevirSayisi() {
        return devirSayisi;
    }
    public void setDevirSayisi(int devirSayisi) {
        this.devirSayisi = devirSayisi;
    }
}

class KullaniciEkrani{
    public void goster(Araba[] arabalar){
        for (int i = 0; i < arabalar.length; i++) {
            Araba araba = arabalar[i];
            System.out.println("Agirlik : "+araba.getAgirlik());
            System.out.println("Model : "+araba.getModel());
            System.out.println("Renk : "+araba.getRenk());
        }
    }
}

class AnaProgram{
    public static void main(String[] args) {
        Araba ford =new Ford();
        ford.setAgirlik(1000);
        ford.setModel("Fiesta");
        ford.setRenk("Gri");
        Araba mercedes=new Mercedes();
        mercedes.setAgirlik(2000);
        mercedes.setModel("E200");
        mercedes.setRenk("Siyah");

        Araba arabalar[]=new Araba[]{mercedes,ford};
        KullaniciEkrani ekran =new KullaniciEkrani();
        ekran.goster(arabalar);
    }

 */
}
