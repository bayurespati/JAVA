package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/2/17.
 */
public class ex_34_ch_8_geometry_rightmost_lowest_point {
    public static void main(String[] args) {
        double[][] point = getPoint();
        double[] rightMostLowest = getRightMostLowest(point);
        print(rightMostLowest);
    }

    public static double[][] getPoint(){
        Scanner input = new Scanner(System.in);

        double[][] point = new double[6][2];

        System.out.print("enter 6 point : ");
        for(int row = 0; row < point.length; row++){
            for(int col = 0; col < point[0].length; col++){
                point[row][col] = input.nextDouble();
            }
        }
        return point;
    }

    public static double[] getRightMostLowest(double[][] point){
        double[] rightMostLowest = new double[2];

        double tempMostLowest = point[0][1];
        double tempMostRight = point[0][0];
        for(int row = 1; row < point.length; row++){
            if(tempMostLowest > point[row][1]){
                tempMostLowest = point[row][1];
                tempMostRight = point[row][0];
            }
        }

        rightMostLowest[0] = tempMostRight;
        rightMostLowest[1] = tempMostLowest;

        return rightMostLowest;
    }

    public static void  print(double[] rightMostLowest){
        System.out.print("The rightmost lowest point is  ("+rightMostLowest[0]+", "+rightMostLowest[1]+")");

    }
}
