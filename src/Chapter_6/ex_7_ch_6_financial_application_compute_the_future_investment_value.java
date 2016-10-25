package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_7_ch_6_financial_application_compute_the_future_investment_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Input investment amount : ");
        double amount = input.nextDouble();
        System.out.printf("Input monthly interest rate : ");
        double rate = (input.nextDouble()/100)/12;
        printFutureInvestmentValue(amount, rate);
    }
    public static void printFutureInvestmentValue(double amount, double rate){
        System.out.println("Years\tFuture Value");
        for(int i = 1; i <= 30; i++){
            System.out.print(i);
            System.out.printf("\t\t%.2f\n",futureInvestmentValue(amount,rate,i));
        }
    }
    public static double futureInvestmentValue(double amount, double rate, int years){
        double investmentValue = amount * Math.pow((1 + rate),(years*12));
        return investmentValue;
    }
}
