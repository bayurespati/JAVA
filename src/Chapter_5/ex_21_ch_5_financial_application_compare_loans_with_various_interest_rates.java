package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/3/16.
 */
public class ex_21_ch_5_financial_application_compare_loans_with_various_interest_rates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount : ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years : ");
        int numberOfYears = input.nextInt();



        for(double annualInterestRate = 5; annualInterestRate <= 8; annualInterestRate +=0.125){
            double monthlyInterestRate = (annualInterestRate) / 1200;
            double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
            double total = monthlyPayment * numberOfYears * 12;

            System.out.printf("%.3f \t", annualInterestRate);
            System.out.printf("%.2f \t", monthlyPayment);
            System.out.printf("%.2f ", total);
            System.out.println();

        }

    }
}
