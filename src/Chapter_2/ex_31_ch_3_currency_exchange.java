package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/13/16.

 */
public class ex_31_ch_3_currency_exchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the exchange rate from dollars to RMB : ");
        double rate = input.nextDouble();

        System.out.print("Enter 0 convert dollars to RMB and 1 vice versa : ");
        double numberConvert = input.nextDouble();

        if(numberConvert == 0) {
            System.out.print("Enter the Dollar amount : ");
            double dollars = input.nextDouble();

            double dollarsToYuan = (dollars * rate);
            System.out.print(dollars + "$ is " + dollarsToYuan + "yuan");
        }
        else if(numberConvert == 1 ) {
            System.out.print("Enter the RMB amount : ");
            double yuan = input.nextDouble();

            double yuanToDollars = yuan / rate;
            System.out.println(+yuan + "yuan is $" + yuanToDollars);
        }
        else
        System.out.println("Incorrect input");
    }
}
