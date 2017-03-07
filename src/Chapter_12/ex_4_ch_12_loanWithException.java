package Chapter_12;



import Chapter_12.library_class_chapter_12.LoanWithException;

import java.util.Scanner;

/**
 * Created by bnamora on 3/7/17.
 */
public class ex_4_ch_12_loanWithException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter annual interest, for example, 8.25 : ");
                double annualInterestRate = input.nextDouble();
                System.out.print("Enter a number of years as integer : ");
                int numberOfYears = input.nextInt();
                System.out.print("Enter loan amount, for example, 120000.95 : ");
                double loanAmount = input.nextDouble();
                LoanWithException loan = new LoanWithException(annualInterestRate, numberOfYears, loanAmount);

                System.out.printf("The loan was created on %s\n" + "The monthly payment is %.2f\nThe total payment is %.2f\n", loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());
                break;
            } catch (IllegalArgumentException ex) {
                System.out.println("\n"+ex.getMessage()+"\n");

                input.nextLine();
            }
        }
    }
}
