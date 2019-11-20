package Day35;

public class Cake {
    String fruits;
    String color;

    public Cake(String f, String yellow) {
        fruits=f;
        color=yellow;
    }


    public static void main(String[] args) {
        Cake Cake=new Cake("banana","yellow" );  // new dedigimizde constructor i cagiriyoruz
        System.out.println(Cake.color +" " +Cake.fruits );
    }
}

