package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/9/16.
 */
public class ex_12_ch_3_palindrom {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a three-digit integer: ");
        int number = input.nextInt();

        int number1 = number % 10;
        int number2 = number % 100;
        int number3 = (number - number2) / 100;

        if(number1 == number3) {
            System.out.println(number + " is a palindrome");
        }
        else
         System.out.println(number+" is not a palindrome");
    }
}
