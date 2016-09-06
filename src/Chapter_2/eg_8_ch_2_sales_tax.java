package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 */
public class eg_8_ch_2_sales_tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $ "+(int)(tax * 100)/100.0);
    }
}
