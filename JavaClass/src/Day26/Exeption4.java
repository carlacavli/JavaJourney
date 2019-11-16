package Day26;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//filenotfoundexeptions

public class Exeption4 {
//    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("C:\\SomeFolder\\file.txt");
//        FileReader fileReader =new FileReader(file);
//    }
//    }
//add exeptions dedi ondan sonra  import yaptim kirmizilik gitti FileReaderin altindaki


// FileNotFoundException
 //public class Exception4 {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\SomeFolder\\file.txt");

            FileReader fileReader = new FileReader(file);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found;");
            System.out.println(ex.getStackTrace());
        }
    }
}
