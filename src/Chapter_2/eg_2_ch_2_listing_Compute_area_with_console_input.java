package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 */
public class eg_2_ch_2_listing_Compute_area_with_console_input {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        double area = radius * radius * Math.PI;

        System.out.println("the area of circle of radius "+radius+" is :" +area);


    }
}
