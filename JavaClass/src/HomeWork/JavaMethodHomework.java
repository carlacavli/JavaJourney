package HomeWork;

import java.util.Scanner;

class WordCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.println("number of words in the string:" +wordcount(str));
    }
    public static int wordcount(String string)
    {
        int wordcount=0;
        char ch[] = new char[string.length()];
        for (int i = 0; i < string.length(); i++)
        {
            ch[i] = string.charAt(i);
            if (((i > 0) && (ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
                wordcount++;
        }
        return wordcount;

    }
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.print("Input the string: ");
//        String str = in.nextLine();

    }

