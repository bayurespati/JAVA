package Chapter_10;

import Chapter_10.library_class_chapter_10.MyString1;

/**
 * Created by bnamora on 2/20/17.
 */
public class ex_22_ch_10_implement_myString {
    public static void main(String[] args) {
        char[] test = {'a','B','v','B'};
        char[] test1 = {'a','b','v','B'};

        MyString1 string = new MyString1(test);
        MyString1 string1 = new MyString1(test1);

        //length
        System.out.println(string.length());

        //charAt
        System.out.println(string.charAt(2));

        //toLowercase
        string.toLowerCase();
        for(int i = 0; i < string.length(); i++){
            System.out.print(string.charAt(i));
        }

        System.out.println();

        //substring
        MyString1 abc = string.substring(1,2);
        for(int i = 0; i < abc.length(); i++){
            System.out.print(abc.charAt(i));
        }

        System.out.println();

        //equal
        System.out.println(string.equal(string1));

        //valueOF
        System.out.println("valueOf : "+MyString1.valueOf(68).charAt(0));
    }
}
