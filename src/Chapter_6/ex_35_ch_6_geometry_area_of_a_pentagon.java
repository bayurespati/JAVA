package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 11/2/16.
 */
public class ex_35_ch_6_geometry_area_of_a_pentagon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The side : ");

        printAreaGeometry(input.nextDouble());
    }

    public static void printAreaGeometry(double side){
        System.out.println("The area of pentagon is : "+computeArea(side));
    }

    public static double computeArea(double side){
        return  (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));
    }
}
