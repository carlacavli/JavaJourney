package SenaWorkHours;

public class DenemeFood {
    public static void main(String[] args) {
        Deneme s = new Deneme();
        s.healthy =true;
        s.hasvegetables=6;
        s.name="turkish";
        s.origine="turkey";
        System.out.println("it is a healty food; "+s.healtyDish());
        System.out.println(s.deliciousDish());


    }
}
