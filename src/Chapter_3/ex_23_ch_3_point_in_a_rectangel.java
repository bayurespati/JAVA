package Chapter_3;

import java.util.Scanner;

/**i
 * Created by DWP on 9/10/16.
 */
public class ex_23_ch_3_point_in_a_rectangel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates : ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = 0;
        double y2 = 0;

        double distance = Math.pow( Math.pow((x2-x1), 2)+ Math.pow((y2-y1), 2), 0.5 );
        boolean valid = (distance <= 5 && y1 <= 2.5 && y1 >= -2.5);


        if(valid)
            System.out.print("Point ("+x1+","+y1+") is in the circle");
        else
            System.out.print("Point ("+x1+","+y1+") is not in the circle");
    }
}
