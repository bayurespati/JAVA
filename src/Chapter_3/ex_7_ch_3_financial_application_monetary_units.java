package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.
 *
 */
public class ex_7_ch_3_financial_application_monetary_units {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        remainingAmount = remainingAmount % 25;
        remainingAmount = remainingAmount % 10;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;

        if (numberOfOneDollars == 1)
            System.out.println(+numberOfOneDollars+" dollar");
        else
            System.out.println(+numberOfOneDollars+" dollars");

        if (numberOfPennies == 1)
            System.out.println(+numberOfPennies+ " penny");
        else
        System.out.println(+ numberOfPennies + " pennies");
    }
}
