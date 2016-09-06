package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 Sum the digits in an integer) Write a program that reads an integer between 0 and 1000 and adds all
 the digits in the integer. For example, if an integer is 932, the sum of all its digits is 14.

 Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
 For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */
public class ex_6_ch_2_sum_the_digit_in_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number between 0 and 1000 : ");
        int digit = input.nextInt();


        int a = digit % 10;
        int b = digit /10 % 10;
        int c = digit/100 % 10;


        int total = a + b + c;

        System.out.println("The sum of the digit : "+total);
    }
}
