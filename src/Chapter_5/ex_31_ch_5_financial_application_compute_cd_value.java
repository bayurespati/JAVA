package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/7/16.
 */
public class ex_31_ch_5_financial_application_compute_cd_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the initial deposit amount : ");
        double amount = input.nextDouble();
        System.out.print("Enter annual percentage yield : ");
        double interestRate = input.nextDouble();
        System.out.print("Enter maturity period (number of months): ");
        int month = input.nextInt();

        double interest = amount * (interestRate/1200);
        System.out.println("Month\t CD Value");

        for(int i = 1; i <= month; i++){

            double cdValue =interest + amount;
            System.out.print(i+"\t\t");
            System.out.printf("%.2f\n",cdValue);
            amount =cdValue;
        }
    }
}
