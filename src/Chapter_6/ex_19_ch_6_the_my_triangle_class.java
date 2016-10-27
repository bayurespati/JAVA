package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/27/16.
 */
public class ex_19_ch_6_the_my_triangle_class {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input 3 Side of Triangle : ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        printAreaOfTriangle(side1,side2,side3);
    }

    public static void printAreaOfTriangle(double side1, double side2, double side3){
        if(isValid(side1,side2,side3))
            System.out.println("The Area of Triangle is : "+area(side1,side2,side3));
        else
            System.out.println("three side of triangle is Invalid ");

    }

    public static boolean isValid (double side1, double side2, double side3){
        return  side1 + side2 > side3 ||
                side1 + side3 > side2 ||
                side2 + side3 > side1;

    }

    public static double area(double side1, double side2, double side3){
        double side = (side1+side2+side3)/2;
        double area = Math.pow(side * (side-side1) * (side-side2) * (side-side3),0.5);

        return area;
    }
}
