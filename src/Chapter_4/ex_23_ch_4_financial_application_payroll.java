package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/20/16.
 */
public class ex_23_ch_4_financial_application_payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee_exercise2 name : ");
        String name =input.next();
        System.out.printf("Enter number of hours worked in a week : ");
        int numberHoursWork = input.nextInt();
        System.out.printf("Enter hourly pay rate : ");
        double payRate = input.nextDouble();
        System.out.printf("Enter federal tax withholding rate : ");
        double federalTaxRate = input.nextDouble();
        System.out.printf("Enter state tax withholding rate : ");
        double stateTaxRate = input.nextDouble();

        double grossPay = numberHoursWork * payRate;
        double totalFederal = grossPay * federalTaxRate;
        double totalState = grossPay * stateTaxRate;
        double totalDeduction = totalFederal + totalState;
        double netPay = grossPay - totalDeduction;

        System.out.println("Employee_exercise2 name : "+name);
        System.out.println("Hours work : "+numberHoursWork);
        System.out.println("Pay Rate : $"+payRate);
        System.out.println("Gross pay : %.1f$"+grossPay);
        System.out.println("Deduction : ");
        System.out.println("   Federal withholding (20.0%) : "+totalFederal);
        System.out.println("   State withholding (9.0%) : "+totalState);
        System.out.println("   Total Deduction : $"+totalDeduction);
        System.out.println("Net pay : "+netPay);

    }
}
