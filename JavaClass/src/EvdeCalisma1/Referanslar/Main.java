package EvdeCalisma1.Referanslar;

public class Main {
    public static void main(String[] args) {
   String s1= new String("muberra");
   String s2= new String("muberra");

   if(s1==s2){        // if (s1.equals(s2)
       System.out.println("esit");
   }else{
       System.out.println("esit degil");
   }


    }
}
/* out put esit degil diye cikar cunku iki tane refereansi karsilastiriyoruz bunlar bellkete ayni yerimi gosteriyor diyoruz
iki farkli objeler yani.icindeki degerleri sorgulamak istersek  s1.equals(s2) yazmaliyiz

 */