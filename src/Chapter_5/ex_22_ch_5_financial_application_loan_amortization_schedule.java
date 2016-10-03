package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/3/16.
 */
public class ex_22_ch_5_financial_application_loan_amortization_schedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount : ");
        int loanAmount = input.nextInt();
        System.out.print("Number of Years : ");
        int numberOfYears = input.nextInt();
        System.out.print("Annual Interest Rate : ");
        double annualInterestRate = input.nextDouble();

        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate /(1-1/Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;
        double balance = loanAmount;


        System.out.printf("Monthly Payment : %.2f\n",monthlyPayment);
        System.out.printf("Total Payment is : %.2f\n",totalPayment);

        for(int payment = 1 ; payment <=12; payment++){

            double monthlyInterest = ((annualInterestRate / 100) / 12)*balance;
            double principal = monthlyPayment - monthlyInterest;
            balance = balance - principal;

            System.out.printf("%d \t",payment);
            System.out.printf("%.2f\t",monthlyInterest);
            System.out.printf("%.2f\t",principal);
            System.out.printf("%.2f",balance);
            System.out.println();

        }
    }
}
