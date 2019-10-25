package JavaClass;

public class JavaClass2concatenatingstrings {
    public static void main(String[] args) {
        // concatenating strings
        String s1 = "hello ";
        String s2 = " world !!!";
        System.out.println( s1+ s2);
        //task1 ;
        // use seperate variable for each word print it in one line
        // using cincatenation
        // ex ; " what" , " is ", "your ", "name", "? " => what is your name

        // task 2 ;
        // continue task 1 , but print each word in new line uing only
        // one system.out.println
        String s3 = " what ";
        String s4 = " is ";
        String s5 = " your";
        String s6 = " name" + " ?";
        String space = "";
        System.out.println( s3  + s4 + s5 + s6);

        space = " \n";
        System.out.println( s3 + space + s4 + space + s5 + space + s6);
        System.out.println( "A\nB\nC\nD\nE\nF");




    }
}
