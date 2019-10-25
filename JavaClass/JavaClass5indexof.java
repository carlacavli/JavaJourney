package JavaClass;

public class JavaClass5indexof {
    public static void main(String[] args) {
                    // 01234567
        String s1 = "hello";
        System.out.println( s1.indexOf("ello"));
        System.out.println( "ex1..............."); //arada bosluk ypsin diye yildizda koyabilirsin alt alta gorunsun diye

        String s2 = "techno study";
        int indexs2 = s2.indexOf(" ech");
        System.out.println( indexs2);


        System.out.println( "ex3 .............");
        String s3 = "so something so many";
        int indexs3 =s3.indexOf( " so");
        System.out.println( indexs3);

        //task1;
        // write a code that count length of string and prints sum of lenght and index of "e"
        //ex; "techno" => 6=1 = 7
        //hint; lenght(), indexof ()



        String s4 = "techno";
        int lenght = s4.length();
        int indexs4 = s4.indexOf("e");
        int sum = lenght + indexs4;
        System.out.println(s4.length() + s4.indexOf("e")); //length uzunluk demek //harflerin kac tane oldugu




    }
}
