package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_4_ch_6_display_an_interger_reversed {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Enter number integer : ");
        reverse(input.nextInt());
    }

    public static void reverse (int number){
        System.out.println("The reverse is : "+ex_3_ch_6_palindrome_integer.reverse(number));
    }
}
