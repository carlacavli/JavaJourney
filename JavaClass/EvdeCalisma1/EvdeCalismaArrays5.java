package EvdeCalisma1;

public class EvdeCalismaArrays5 {
    public static void main(String[] args) {
        double grades[] = {96.5, 96.7, 88.5, 80.1, 70.4, 99.9};
        double max;
        max = grades[0];
        int i;
        for (i = 0; i <= 5; i++)
        {
            if (grades[i] > max) max = grades[i];
        }
        System.out.println("the max grades in the class is : " + max);
    }
}
