package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/14/16.
 */
public class ex_1_ch_4_geometry_area_of_a_pentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.printf("Enter the length from center to a vertex : ");
        double length = input.nextDouble();

        double side = (2 * length ) * Math.sin(Math.PI / 5);
        double area = (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

        System.out.printf("The area of the pentagon %.2f",area);

    }
}
