package EvdeCalisma1.Arrays;

import java.util.Scanner;

// bellegimizde 5 lik bir yer ayriliyor bnu icinede 10,20.. degeerleri koyuyoruz
// 0 dan baslayarak indexlenir.
// once stringin degerleirni yazdirdik ,sonra ortalama diye bir method yazip ortalamalirin bulduk
// ortalamayi bastirmak icin mainin altinda en sonda cagirdik

public class Main {
    public static void ortalama(int[]arr){
        int total =0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("ortalama "+total/arr.length);
    }
    public static void main(String[] args) {
   //     int[] arr = {10, 20, 30, 40, 50};
//        for (int i = 0; i < 5 ; i++) {    // 5 yazdigimiz yere arr.lenght yazarsakta sonuc ayni olur daha guvenli olur
//            System.out.println(arr[i]);

        Scanner scan = new Scanner(System.in);

        int [] arr2 =new int[5];
        System.out.println("arrayin degerlerini girin");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]= scan.nextInt();
            }
      ortalama(arr2);
        }
        }

