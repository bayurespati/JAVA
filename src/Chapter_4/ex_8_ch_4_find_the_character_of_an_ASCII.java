package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/16/16.
 *
 */
public class ex_8_ch_4_find_the_character_of_an_ASCII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ASCII code : ");
        int number = input.nextInt();
        System.out.println("The character for ASCII code "+number+" is "+(char)number);
    }
}
