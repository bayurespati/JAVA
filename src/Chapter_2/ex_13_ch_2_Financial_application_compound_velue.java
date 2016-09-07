package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 Suppose you save $100 each month into a savings account with the annual interest rate 5%. Thus,
 the monthly inter- est rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes

 100 * (1 + 0.00417) = 100.417
 After the second month, the value in the account becomes
 (100 + 100.417) * (1 + 0.00417) = 201.252
 After the third month, the value in the account becomes
 (100 + 201.252) * (1 + 0.00417) = 302.507
 and so on.
 */
public class ex_13_ch_2_Financial_application_compound_velue {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount : ");
        double monthlySaving = input.nextDouble();
        double saving = 0;

        double interest = (1 + 0.00417);

        saving = ((saving + monthlySaving) * interest);
        saving = ((saving + monthlySaving) * interest);
        saving = ((saving + monthlySaving) * interest);
        saving = ((saving + monthlySaving) * interest);
        saving = ((saving + monthlySaving) * interest);
        saving = ((saving + monthlySaving) * interest);





        System.out.print("After sixth month, the account Value is : " + saving);
    }
}
