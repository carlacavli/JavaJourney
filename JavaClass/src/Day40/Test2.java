package Day40;

public class Test2 {
    private String name;

    public String getName(){          // ama burda void yok String yazman gerek
        return name;
    }

    public void setName(String n){       //voitten sonra return koymana gerek yok , dont return anything diyoruz
        name = n;

    }
    private int age;
    public int  getAge(){
       return  age;

    }
    public void setAge(int a){
        age=a;
    }
}
