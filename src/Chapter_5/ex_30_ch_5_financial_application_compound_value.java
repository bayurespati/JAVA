package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/7/16.
 */
public class ex_30_ch_5_financial_application_compound_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input amount : ");
        double amount = input.nextDouble();
        System.out.print("Input Interest rate : ");
        double interestRate = input.nextDouble();
        System.out.print("Input number of month : ");
        int month = input.nextInt();

        double monthlyInterestRate = 1 + ((interestRate / 100)/12);
        double savingAmount = amount * monthlyInterestRate;

            for(int i = month;i > 1; i--){
                savingAmount = (amount + savingAmount) * monthlyInterestRate;
            }

        System.out.println("Total your money in "+month+" month is : "+savingAmount);
    }
}
