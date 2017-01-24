package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/24/17.
 */
public class ex_7_ch_8_points_nearest_to_each_other {
    public static void main(String[] args) {
        double[][] points = getPoint();
        double[][] nearestPoint = getNearestPoint(points);

        printNearestPoint(nearestPoint);
    }


    public static double[][] getPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of points :");
        int numberOfPoints = input.nextInt();
        System.out.print("Enter "+numberOfPoints+" points : ");

        double[][] points = new double [numberOfPoints][3];


        for(int row = 0; row < points.length; row++){
            for(int col = 0; col < points[0].length; col++){
                points[row][col] = input.nextDouble();
            }
        }

        return points;
    }

    public static double[][] getNearestPoint(double[][] points){
        double[][] nearestPoint = new double[2][3];
        int p1 = 0, p2 = 1;

        double shortestDistance = getDistance(points[p1][0], points[p1][1],points[p1][2] , points[p2][0], points[p2][1],points[p2][2]);

        for (int i = 1; i < points.length; i++){
            for (int j = i + 1; j < points.length; j++) {
                double distance = getDistance(points[i][0], points[i][1],points[i][2] , points[j][0], points[j][1],points[j][2]);

                if(shortestDistance > distance){
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }

        for(int col = 0; col < nearestPoint[0].length; col++){
            nearestPoint[0][col] = points[p1][col];
            nearestPoint[1][col] = points[p2][col];
        }


        return nearestPoint;
    }

    public static double getDistance(double x1, double y1, double z1, double x2, double y2, double z2){
        double fuck = Math.sqrt( (Math.pow((x2 - x1),2)) + (Math.pow((y2-y1),2))  + (Math.pow((z2 - z1),2)) );

        System.out.println(fuck);

        return fuck;
    }

    public static void printNearestPoint(double[][] nearestPoint){

        for(int row = 0; row < nearestPoint.length; row++){
            System.out.print(" point"+row+" is :");
            for(int col = 0; col < nearestPoint[0].length; col++){
                System.out.print(" "+nearestPoint[row][col]);
            }
            System.out.println();
        }
    }

}
