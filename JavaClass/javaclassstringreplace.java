package JavaClass;

public class javaclassstringreplace {
    public static void main(String[] args) {
        String s1 = "hello world";
        System.out.println(s1.replace("o" , "@"));
        String s2 ="one two one three";
        System.out.println(s2.replace("one","four"));

        String s3 = "name;surname;age;grade;class";
        System.out.println(s3.replace(";" ," "));
        //task 1;
        //write a program that replace yoour name with your surname
        // using replace()
        //ex; michale => jackson
        String s4 = "muberra";
        System.out.println(s4.replace("muberra","cavli"));
        System.out.println(s4);
    }
}
