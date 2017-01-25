package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/25/17.
 */
public class ex_15_ch_8_geometry_same_line {
    public static void main(String[] args) {
        //1 1 2 2 3 3 4 4 5 5  1 5 0 4 -1 3 -2 2 -3 1
        double[][] points = getPointsFromInput();
        boolean isSameLine = (getStatusPoint(points));

        System.out.print("The Five points ");
        System.out.println((isSameLine) ? "is on the same line":"is not on the same line");

    }

    public static double[][] getPointsFromInput(){
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];

        System.out.print("Enter Five Points : ");
        for(int row = 0; row < points.length; row++){
            for(int col = 0; col < points[0].length; col++){
                points[row][col] = input.nextDouble();
            }
        }

        return points;
    }

    public static boolean getStatusPoint(double[][] points){
        for(int row = 2; row < points.length; row++){
                double cekSameLine =
                        (points[1][0] - points[0][0]) *
                                    (points[row][1] - points[0][1]) -
                                    (points[row][0] - points[0][0])*
                                    (points[1][1] - points[0][1]);

                if(cekSameLine != 0){
                    return false;
                }
        }
        return true;
    }
}
