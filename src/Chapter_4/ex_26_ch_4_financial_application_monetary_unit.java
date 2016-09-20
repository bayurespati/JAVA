package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/20/16.
 */
public class ex_26_ch_4_financial_application_monetary_unit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount in double, for example 11.56: ");
        String amount = input.nextLine();

        int limit = amount.indexOf('.');
        String dollar = amount.substring(0, limit);
        String cent = amount.substring(limit + 1);

        System.out.println("Dollar : "+dollar);
        System.out.println("Cent : "+cent);
    }
}
