package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/13/16.
 */
public class ex_33_ch_3_financial_compare_cost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1 : ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();

        System.out.print("Enter weight and price for package 2 : ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        double cost1 = weight1 / price1;
        double cost2 = weight2 / price2;

        if(cost1 > cost2)
            System.out.print("Package 1 has better price");
        else if(cost1 == cost2)
            System.out.print("Two package have the same price");
        else
            System.out.println("Package 2 has better price");

    }
}
