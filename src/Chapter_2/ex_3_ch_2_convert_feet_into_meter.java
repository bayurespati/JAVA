package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.

 (Convert feet into meters) Write a program that reads a number in feet, converts it to meters,
 and displays the result. One foot is 0.305 meter. Here is a sample run:

 */
public class ex_3_ch_2_convert_feet_into_meter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a value for feet: ");
        double feet = input.nextDouble();

        double meter = feet * 0.305;
        System.out.println(feet+"feet is "+meter+" meter");
    }
}
