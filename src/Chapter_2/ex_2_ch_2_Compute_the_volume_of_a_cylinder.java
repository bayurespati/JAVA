package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 Compute the volume of a cylinder) Write a program that reads in the radius and length of a cylinder and
 computes the area and volume using the following formulas:
 area = radius * radius * p volume = area * length

 */
public class ex_2_ch_2_Compute_the_volume_of_a_cylinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter the radius and length of a cylinder: ");
        double radius = input.nextDouble();
        double length = input.nextDouble();

        double area = radius * radius * Math.PI;
        double volume = area * length;

        System.out.println("the area is :" + area);
        System.out.println("the volume is : " +  volume);
    }
}
