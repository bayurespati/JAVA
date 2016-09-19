package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/16/16.
 */
public class ex_13_ch_4_vowel_or_consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a letter : ");
        String letter = input.next();

        char ch = letter.charAt(0);

        boolean condition = (ch == 'a' || ch == 'i' || ch == 'u' || ch == 'e' || ch == 'o'||
        ch == 'A' || ch == 'I' || ch == 'U' || ch == 'E' || ch == '0');
        if(condition)
            System.out.print(ch+" Is vowel ");
        else if(Character.isLetter(ch))
            System.out.print(ch+" Is consonant");
        else
        System.out.print(ch+" Is FUCK YOU");
    }
}
