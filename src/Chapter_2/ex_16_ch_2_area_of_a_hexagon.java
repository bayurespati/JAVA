package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 Write a program that prompts the user to enter the side of a hexagon and displays its area.
 The formula for computing the area of a hexagon is

 */
public class ex_16_ch_2_area_of_a_hexagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side : ");
        double side = input.nextDouble();

        double areaHexagon = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(side, 2);
        System.out.printf("The area of the hexagon : %.4f",areaHexagon);
    }
}
