package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 rewrite Listing 2.10, ComputeChange .java, to fix the possible loss of accuracy when converting a double
 value to an int value. Enter the input as an integer whose last two digits represent the cents. For example,
 the input 1156 represents 11 dollars and 56 cents.

 */
public class ex_22_ch_2_financial_application_monetary_units {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("input number : ");
        int number = input.nextInt();

        int dollar = number / 100;
        int cents = number % 100;

        System.out.println(dollar+" dollar "+cents+" cents ");
    }
}
