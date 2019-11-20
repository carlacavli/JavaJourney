package Example;

public class Constructor1 {
    int value ;
    public Constructor1(int val){   //public olmasi gerekiyor ve classin ismiyle ayni olmasi gerekiyor
                                    // already value yi aliyor ayriyetten yazmamiza gerek yok o yuzden kullaniyoruz
        value = val;
    }

    public static void main(String[] args) {
        Constructor1 c1 = new Constructor1(5);
        System.out.println(c1.value);
    }
}
