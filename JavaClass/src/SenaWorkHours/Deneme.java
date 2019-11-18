package SenaWorkHours;

import javax.swing.*;

public class Deneme {
    public  String name;
    public String origine;
    public boolean healthy;
    public int cooktime;
    public int hasvegetables;
    public int ingredients;

    public boolean healtyDish() {
        if (hasvegetables >= 3 || ingredients >= 5) {
            return true;
        } else {
            return false;
        }
    }
        public String deliciousDish(){
            if(healthy==true && name ==origine){
            return "turkish food is delicious";
        }else{
                return "learn how to cook turkish food";
            }








    }
}
