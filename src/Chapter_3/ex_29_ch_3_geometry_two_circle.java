package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/13/16.
 */
public class ex_29_ch_3_geometry_two_circle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter circle1 center x, y coordinates , and radius : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double radiusC1= input.nextDouble();

        System.out.print("Enter circle2 center x, y coordinates , and radius : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double radiusC2 = input.nextDouble();

        double distanceBetwenCenter = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);

        boolean c2insidec1 = (distanceBetwenCenter <= radiusC1-radiusC2);
        boolean overlaps = (distanceBetwenCenter <= radiusC1+radiusC2);
        boolean c1insidec2 = (distanceBetwenCenter <= radiusC2-radiusC1);

        if (radiusC1 < radiusC2);
        if (c1insidec2)
            System.out.print("Circle1 is inside Circle2");
        else if (c2insidec1)
            System.out.println("circle2 is inside circle1");
        else if (overlaps)
            System.out.print("circle2 overlaps circle1");
        else
            System.out.println("circle2 does not overlap circle1");

    }
}
