package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/10/16.

 */
public class ex_22_ch_3_geometry_point_in_a_circle {
    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);

        System.out.print("Enter a point with two coordinates : ");

        double x1 = input.nextInt();
        double y1 = input.nextInt();

        double x2= 0;
        double y2= 0;

        double distance = Math.pow( Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2), 0.5 );

        boolean valid = (distance <= 10);

        if(valid){
            System.out.print("point("+x1+","+y1+") is in the circle");
        }
        else
            System.out.print("point("+x1+","+y1+") is not in the circle");
    }
}
