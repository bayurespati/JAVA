package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_5_ch_6_sort_three_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Input three number : ");
        displaySortNumbers(input.nextDouble(),input.nextDouble(),input.nextDouble());
    }

    public static void displaySortNumbers(double num1, double num2, double num3){
        if(num1 > num2){
            double tempt = num1;
            num1 = num2;
            num2 = tempt;
        }
        if(num2 > num3){
            double temp = num2;
            num2 = num3;
            num3 = temp;
        }
        if(num1 > num3){
            double temp = num1;
            num1 = num3;
            num3 = temp;
        }
        if(num1 > num2){
            double tempt = num1;
            num1 = num2;
            num2 = tempt;
        }

        System.out.printf("%.0f %.0f %.0f ",num1,num2,num3);
    }
}
