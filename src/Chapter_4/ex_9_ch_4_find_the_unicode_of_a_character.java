package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/16/16.
 */
public class ex_9_ch_4_find_the_unicode_of_a_character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character : ");
        String ch = input.next();

        int a = ch.charAt(0);

        System.out.println("The unicode for the character "+ch+" is "+a);
    }
}
