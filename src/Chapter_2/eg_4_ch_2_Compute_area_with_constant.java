package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 */
public class eg_4_ch_2_Compute_area_with_constant {
    public static void main(String[] args) {
        final double PI = Math.PI;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for radius : ");
        double radius = input.nextDouble();

        double area = radius*radius*PI;

        System.out.println("the area for the circle of radius " +radius+" is " + area);
    }
}
