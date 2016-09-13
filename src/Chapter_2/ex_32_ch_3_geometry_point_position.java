package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/13/16.


 */
public class ex_32_ch_3_geometry_point_position {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three point for P0,p1 and p2 : ");
        double x0 = input.nextDouble();
        double y0 = input.nextDouble();
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double pointOfp2 = (x1 - x0) * (y2 - y0) - (x2 - x0) * (y1 - y0);

        if(pointOfp2 > 0)
            System.out.print(+x2+" "+y2+" Is on the left side of the line from "+x0+y0+" to "+x1+" "+y1);
        else if(pointOfp2 == 0)
            System.out.print(+x2+" "+y2+" Is on the line from "+x0+y0+" to "+x1+" "+y1);
        else
            System.out.print(+x2+" "+y2+" Is on the right side of the line from "+x0+y0+" to "+x1+" "+y1);
    }
}
