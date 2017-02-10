package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 11/2/16.
 */
public class ex_36_ch_6_area_of_regular_polygon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter The number of side : ");
        int numberOfSide = input.nextInt();
        System.out.print("Enter The side : ");
        double side = input.nextDouble();

        printAreaOfPolygon(numberOfSide,side);
    }

    public static void printAreaOfPolygon(int numberOfSide, double side){
        System.out.println("The area of polygon is : "+computeAreaOfPolygon(numberOfSide,side));
    }

    public static double computeAreaOfPolygon(int numberOfSide, double side){
        return  (numberOfSide * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / numberOfSide));
    }
}
