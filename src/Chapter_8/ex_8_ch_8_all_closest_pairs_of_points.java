package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/24/17.
 */
public class ex_8_ch_8_all_closest_pairs_of_points {
    public static void main(String[] args) {
        double[][] points = getPoint();
        double minimumClosePoint = getMinimumClosePoint(points);

        printListClosePoint(points,minimumClosePoint);
    }

    public static double[][] getPoint(){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the Number of points :");
        int numberOfPoints = input.nextInt();

        double[][] points = new double [numberOfPoints][2];
        System.out.print("Enter "+numberOfPoints+" points : ");
        for(int row = 0; row < points.length; row++){
            for(int col = 0; col < points[0].length; col++){
                points[row][col] = input.nextDouble();
            }
        }

        return points;
    }

    public static double getMinimumClosePoint(double[][] points){
        double shortestDistance = getDistance(points[0][0], points[0][1], points[1][0], points[1][1]);
        for (int i = 1; i < points.length; i++){
            for (int j = i + 1; j < points.length; j++) {
                double distance = getDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if(shortestDistance > distance){
                    shortestDistance = distance;
                }
            }
        }
        return shortestDistance;
    }

    public static double getDistance(double x1 , double y1, double x2, double y2){
        return Math.sqrt((x2-x1) * (x2 - x1) + (y2-y1) * (y2-y1));
    }


    public static void printListClosePoint(double[][] points, double minimumClosePoint){
        for (int i = 0; i < points.length; i++){
            for (int j = i + 1; j < points.length; j++) {
                double distance = getDistance(points[i][0], points[i][1], points[j][0], points[j][1]);
                if(distance == minimumClosePoint){
                    System.out.println("The Closest two points ara "+points[i][0]+","+points[i][1]+" and "+points[j][0]+","+points[j][1]);
                }
            }
        }
        System.out.println("Their Distance is : "+minimumClosePoint);
    }
}
