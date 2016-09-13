package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/13/16.


 */
public class ex_28_ch_3_geometry_two_rectangles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter r1 center x, y coordinates, width and height : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double width1 = input.nextDouble();
        double height1 = input.nextDouble();

        System.out.print("Enter r2 center x, y coordinates, width and height : ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        double width2 = input.nextDouble();
        double height2 = input.nextDouble();

        double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);

        double area1 = (width1 * height1);
        double area2 = (width2 * height2);

        boolean overlaps = (width1 / 2 + width2 / 2 >= distance) || height1 / 2 + height2 >= distance;
        boolean insideR1ToR2 = (distance < width2 / 2 || distance < height2 / 2) && (width2 > width1 && height2 > height1);
        boolean insideR2ToR1 = (distance < width1 / 2 || distance < height1 / 2) && (width1 > width2 && height1 > height2);

        if (area1 < area2);
        if (insideR1ToR2)
                System.out.print("r1 is inside r2");
        else if (insideR2ToR1)
                System.out.println("r2 is inside r1");
        else if (overlaps)
                System.out.print("r2 overlaps r1");
        else
                System.out.println("r2 does not overlap r1");

    }

}
