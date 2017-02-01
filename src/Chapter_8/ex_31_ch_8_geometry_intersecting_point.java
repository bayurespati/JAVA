package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/1/17.
 */
public class ex_31_ch_8_geometry_intersecting_point {
    public static void main(String[] args) {
        double[][] point = getPoint();
        double[] intersectingPoint = getIntersectingPoint(point);

        System.out.println(intersectingPoint == null
                ? "The two lines are parallel"
                : "The intersecting point at ("+intersectingPoint[0]+", "+intersectingPoint[1]+")");
    }

    public static double[][] getPoint(){
        Scanner input = new Scanner(System.in);

        double[][] point = new double[4][2];
        System.out.print("Enter 4 point : ");
        for(int row = 0; row < point.length; row++){
            for(int col = 0; col < point[0].length; col++){
                point[row][col] = input.nextDouble();
            }
        }
        return point;
    }

    public static double[] getIntersectingPoint(double[][] point){
        double[] intersectingPoint = new double[2];
        double[] points = new double[6];

        points[0] =  (point[0][1] - point[1][1]);
        points[1] = -(point[0][0] - point[1][0]);
        points[2] =  (point[2][1] - point[3][1]);
        points[3] = -(point[2][0] - point[3][0]);

        points[4] = ((point[0][1] - point[1][1]) * point[0][0]) - ((point[0][0] - point[1][0]) * point[0][1]);
        points[5] = ((point[2][1] - point[3][1]) * point[2][0]) - ((point[2][0] - point[3][0]) * point[2][1]);

        intersectingPoint[0] = ((points[4] * points[3]) - (points[1] * points[5])) / ((points[0] * points[3])-(points[1] * points[2]));
        intersectingPoint[1] = ((points[0] * points[5]) - (points[4] * points[2])) / ((points[0] * points[3])-(points[1] * points[2]));

        double number = (points[0] * points[3]) - (points[1] * points[2]);

        if(number == 0){
            return null;
        }

        return intersectingPoint;
    }
}
