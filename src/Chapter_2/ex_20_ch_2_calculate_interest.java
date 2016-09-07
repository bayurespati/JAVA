package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 (Financial application: calculate interest) If you know the balance and the annual percentage interest rate,
 you can compute the interest on the next monthly pay- ment using the following formula:

 interest = balance * (annualInterestRate/1200)

 Write a program that reads the balance and the annual percentage interest rate and
 displays the interest for the next month

 */
public class ex_20_ch_2_calculate_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter balance and interest rate (e.g., 3 for 3%) : ");

        double balance = input.nextDouble();
        double rate = input.nextDouble();

        double interest = balance * (rate/1200);

        System.out.printf("The interest : %.5f",interest);
    }
}
