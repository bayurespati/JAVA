package Chapter_10;

import Chapter_10.library_class_chapter_10.MyCharacter;

/**
 boolean isLetter();
 isDigit();
 isWhiteSpace();
 isUppercase();
 isLowerCase();

 char toUpperCase();
 char toLowerCase();
 String toString();


 * Created by bnamora on 2/21/17.
 */
public class ex_24_ch_10_implement_MyCharacter {
    public static void main(String[] args) {
        System.out.println(MyCharacter.isLetter('a'));
        System.out.println(MyCharacter.isLetter('*'));

        System.out.println(Character.isDigit(58));
        System.out.println(MyCharacter.isDigit(58));

        System.out.println(Character.isDigit('0'));
        System.out.println(MyCharacter.isDigit('0'));


        System.out.println(MyCharacter.isWhiteSpace(' '));


        System.out.println(MyCharacter.toUpperCase('f'));
        System.out.println(MyCharacter.toLowerCase('Z'));

        System.out.println(MyCharacter.isUpperCase('Z'));
        System.out.println(MyCharacter.isLowerCase('f'));

        System.out.println((int) 'A');
        System.out.println((int) 'Z');
    }
}
