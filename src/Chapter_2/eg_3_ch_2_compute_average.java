package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 */
public class eg_3_ch_2_compute_average {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three number : ");

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        double average = ((number1+number2+number3)/3);

        System.out.println("The average of " +number1+" "+number2+" "+number3+" is "+average);
    }
}
