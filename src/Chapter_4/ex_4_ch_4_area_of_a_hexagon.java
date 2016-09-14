package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/14/16.
 */
public class ex_4_ch_4_area_of_a_hexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side : ");
        double length = input.nextDouble();


        double side = Math.pow(length,2);
        double area = (6 * side)/(4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon : %.2f",area);
    }
}
