package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/2/17.
 */
public class ex_32_ch_8_geometry_area_of_triangle {
    public static void main(String[] args) {
        double[][] pointTriangle = getPointsTriangle();

        double areaOfTriangle = getTriangleArea(pointTriangle);

        System.out.println( ( areaOfTriangle == 0 )
                ? "The three points are on the same line"
                : "The area of the triangle is "+areaOfTriangle);

    }
    public static double[][] getPointsTriangle(){
        Scanner input = new Scanner(System.in);

        double[][] pointTriangle = new double[3][2];

        System.out.print("Enter x1,y1,x2,y2,x3,y3 : ");
        for(int row = 0; row < pointTriangle.length; row++){
            for(int col = 0; col < pointTriangle[0].length; col++){
                pointTriangle[row][col] = input.nextDouble();
            }
        }

        return pointTriangle;
    }

    public static double getTriangleArea(double[][] pointTriangle) {
        double[] side = new double[3];
        double checkSameLine = (pointTriangle[0][0] * pointTriangle[1][1]) - (pointTriangle[0][1] * pointTriangle[1][0]);

        side[0] = Math.pow(Math.pow((pointTriangle[1][0] - pointTriangle[0][0]), 2) + Math.pow((pointTriangle[1][1] - pointTriangle[0][1]), 2), 0.5);
        side[1] = Math.pow(Math.pow((pointTriangle[2][0] - pointTriangle[0][0]), 2) + Math.pow((pointTriangle[2][1] - pointTriangle[0][1]), 2), 0.5);
        side[2] = Math.pow(Math.pow((pointTriangle[1][0] - pointTriangle[2][0]), 2) + Math.pow((pointTriangle[1][1] - pointTriangle[2][1]), 2), 0.5);


        if (checkSameLine == 0) {
            return 0;
        } else {
            double sumOFSide = (side[0] + side[1] + side[2]) / 2;
            return Math.pow(sumOFSide * (sumOFSide - side[0]) * (sumOFSide - side[1]) * (sumOFSide - side[2]), 0.5);
        }
    }
}
