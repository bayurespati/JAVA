package Chapter_10;

import Chapter_10.library_class_chapter_10.Loan;

import java.util.Scanner;

/**
 * Created by bnamora on 2/13/17.
 */
public class eg_1_ch_10_test_loan_class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest, for example, 8.25 : ");
        double annualInterestRate = input.nextDouble();

        System.out.print("Enter a number of years as integer : ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95 : ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate,numberOfYears,loanAmount);

        System.out.printf("The loan was created on %s\n" +
                         "The monthly payment is %.2f\nThe total payment is %.2f\n",
                 loan.getLoanDate().toString(), loan.getMonthlyPayment(),
                 loan.getTotalPayment());
    }
}
