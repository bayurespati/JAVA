package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/14/16.
 *
 */
public class ex_5_ch_4_geometry_area_of_a_regular_random {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of side : ");
        double numberOfSide = input.nextDouble();

        System.out.printf("Enter the side : ");
        double side = input.nextDouble();

        double area = (numberOfSide * Math.pow(side,2) / (4 * Math.tan(Math.PI / numberOfSide)));

        System.out.println("The area of the polygon : "+area);
    }
}
