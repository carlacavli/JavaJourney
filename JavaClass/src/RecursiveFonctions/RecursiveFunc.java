package RecursiveFonctions;

public class RecursiveFunc {

    public static int f(int x){
        if(x==10) return 10;
        System.out.println("x:"+x);
        return x+f(x+1);
    }
    // f(0): 0 + f(1)
    // f(1): 1 + f(2)
    // f(2): 2 + f(3)
    // ..
    // f(8): 8+ f(9)
    // f(9): 9+ f(10) -> 9+ 10
    // f(10): 10
    public static void main(String[] args) {
//       int toplam = 0;
//        for(int i = 0;i<10;i++){
//            toplam += i+1;
//            System.out.println("toplam:"+ toplam + "i: "+ i);
//        }
//        System.out.println("Sonuç"+toplam);
        System.out.println("f(0):"+ f(0));
    }

}


