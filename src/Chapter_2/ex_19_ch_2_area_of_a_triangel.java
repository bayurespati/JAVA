package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3)
 of a triangle and displays its area. The formula for computing the area of a triangle is

 */
public class ex_19_ch_2_area_of_a_triangel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three points for a triangle : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double side1 = Math.pow( Math.pow((x2 - x1), 2)+ Math.pow( (y2-y1), 2), 0.5 );
        double side2 = Math.pow( Math.pow((x3 - x1), 2)+ Math.pow( (y3-y1), 2), 0.5 );
        double side3 = Math.pow( Math.pow((x2 - x3), 2)+ Math.pow( (y2-y3), 2), 0.5 );

        double side = (side1+side2+side3)/2;
        double area = Math.pow(side * (side-side1) * (side-side2) * (side-side3),0.5);

        System.out.printf("The area of the triangle is :%.1f",area);
    }
}
