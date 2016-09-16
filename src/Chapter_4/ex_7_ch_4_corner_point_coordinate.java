package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/16/16.
 *
 *
 */
public class ex_7_ch_4_corner_point_coordinate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the bounding circle : ");
        double radius = input.nextDouble();


        double p1x = radius * Math.cos(Math.PI/2 - (2 * Math.PI)/5);
        double p1y = radius * Math.sin(Math.PI/2 - (2 * Math.PI)/5);
        double p2x = radius * Math.cos(Math.PI/2);
        double p2y = radius * Math.sin(Math.PI/2);
        double p3x = radius * Math.cos(Math.PI/2 + (2 * Math.PI)/5);
        double p3y = radius * Math.sin(Math.PI/2 + (2 * Math.PI)/5);
        double p4x = radius * Math.cos(Math.PI/2 + ((2 * Math.PI)/5)*2);
        double p4y = radius * Math.sin(Math.PI/2 + ((2 * Math.PI)/5)*2);
        double p5x = radius * Math.cos(Math.PI/2 + ((2 * Math.PI)/5)*3);
        double p5y = radius * Math.sin(Math.PI/2 + ((2 * Math.PI)/5)*3);

        System.out.printf("(%8.4f, %8.4f)\n", p1x, p1y);
        System.out.printf("(%8.4f, %8.4f)\n", p2x, p2y);
        System.out.printf("(%8.4f, %8.4f)\n", p3x, p3y);
        System.out.printf("(%8.4f, %8.4f)\n", p4x, p4y);
        System.out.printf("(%8.4f, %8.4f)\n", p5x, p5y);

    }
}
