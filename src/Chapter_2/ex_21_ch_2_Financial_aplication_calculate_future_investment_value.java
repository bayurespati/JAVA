package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 Write a program that reads in investment amount, annual interest rate, and number of years,
 and dis- plays the future investment value using the following formula:

 For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1,
 the future investment value is 1032.98.

 */
public class ex_21_ch_2_Financial_aplication_calculate_future_investment_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount : ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage : ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate =   annualInterestRate / 1200;

        System.out.print("Enter number of years : ");
        double years = input.nextDouble();
        double numberOfYears = years * 12;



        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate),numberOfYears);

        System.out.print("Accumulated value : " +futureInvestmentValue);

    }
}
