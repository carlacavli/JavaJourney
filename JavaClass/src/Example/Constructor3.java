package Example;

public class Constructor3 {
    private int data;
    private Constructor3(){
        data =5;
    }
}
class Test{
    public static void main(String[] args) {
       // Constructor3 c3 = new Constructor3(); compilation error verdi cunku privatten cagiriyoruz Constructor3 u
    }
}
