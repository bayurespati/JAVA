package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 */
public class eg_10_ch_2_compute_change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarter = remainingAmount / 25;

        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;


        System.out.println("Your amount "+amount+" consist of  ");
        System.out.println("   "+numberOfOneDollars+ " dollars");
        System.out.println("   "+numberOfQuarter+ " quarter");
        System.out.println("   "+numberOfDimes+ " dimes");
        System.out.println("   "+numberOfNickels+ " nickles");
        System.out.println("   "+numberOfPennies+ " pennies");
    }
}
