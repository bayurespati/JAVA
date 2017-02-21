package Chapter_10;

import Chapter_10.library_class_chapter_10.MyString2;

/**
 * Created by bnamora on 2/21/17.
 */
public class ex_23_ch_10_implement_myString2 {
    public static void main(String[] args) {

        boolean b = true;
        MyString2 string2 = new MyString2("abcd");
        MyString2 string3 = new MyString2("efgh");

        //compare
        System.out.println(string2.compare(string3.toString()));

        //substring
        MyString2 string4 = string2.substring(1);
        for(int i = 0; i < string4.length(); i++){
            System.out.print(string4.chatAt(i));
        }
        System.out.println();

        //uppercase
        MyString2 string5 = string3.toUpperCase();
        for(int i = 0; i < string5.length(); i++){
           System.out.print(string5.chatAt(i));
        }
        System.out.println();

        //to char[]
        char[] klm = string3.toChar();
        for(int i = 0; i<klm.length; i++){
            System.out.print(klm[i]);
        }

        System.out.println();
        //valueOf
        System.out.println(MyString2.valueOf(b).toChar());
    }
}
