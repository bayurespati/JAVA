package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/10/16.
 *
 */
public class ex_27_ch_3_geometri_point_int_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point x and y coordinates : ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        int x0 = 200;
        int y0 = 0;
        int x1 = 0;
        int y1 = 100;

        double p1 = (x1 - x0)*(y - y0)-(x-x0)*(y1-y0);

        boolean inside = (p1 >= 0) && (x >= 0 && y >= 0);

        if(inside){
            System.out.print("The point is in the triangle");
        }
        else
            System.out.print("The point is not in the triangle");

    }
}
