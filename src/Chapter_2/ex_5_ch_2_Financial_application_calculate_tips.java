package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 Financial application: calculate tips) Write a program that reads the subtotal and the gratuity rate,
 then computes the gratuity and total. For example, if the user enters 10 for subtotal and 15% for gratuity rate,
 the program displays $1.5 as gratuity and $11.5 as total.

 */
public class ex_5_ch_2_Financial_application_calculate_tips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter subtotal and gratuity rate: ");
        double subTotal = input.nextDouble();
        double subGratuity = input.nextDouble();

        double gratuity = subGratuity / 10;
        double total = subTotal + gratuity;

        System.out.println("the gratuity is $"+gratuity+" and total $"+total);
    }


}
