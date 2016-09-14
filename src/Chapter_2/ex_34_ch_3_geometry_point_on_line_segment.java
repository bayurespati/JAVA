package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/13/16.
 */
public class ex_34_ch_3_geometry_point_on_line_segment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three point for P0,p1 and p2 : ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        boolean determinantOfp2 = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0) == 0;
        boolean limitForP2 = (x0 < x1 && x2 < x1 )&&(x2 > x0) || (x1 < x0 && x2 < x0) && (x2 >x1);

        if(determinantOfp2 && limitForP2)
            System.out.print(+x2+" "+y2+" Is on the line  from "+x0+y0+" to "+x1+" "+y1);
        else
            System.out.print(+x2 + " " + y2 + " Is not on the line segment from " + x0 + y0 + " to " + x1 + " " + y1);

    }
}
