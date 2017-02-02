package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/2/17.
 */
public class ex_33_ch_8_geometry_polygon_subarea {
    public static void main(String[] args) {
        double[][] point = getPoint();
        double[] subAreaOfTriangle = getSubAreaOfTriangle(point);
        print(subAreaOfTriangle);
    }

    public static double[][] getPoint(){
        Scanner input = new Scanner(System.in);
        double[][] point = new double[4][2];
        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        for(int row = 0; row < point.length; row++){
            for(int col = 0; col < point[0].length; col++){
                point[row][col] = input.nextDouble();
            }
        }

        return point;
    }

    public static double[] getSubAreaOfTriangle(double[][] point){
        double[] intersectingPoint = getIntersectingPoint(point);
        double[] subAreaOfTriangle = new double[4];

        for(int i = 0; i < subAreaOfTriangle.length; i++){
            double[][] pointTriangle = getPointTriangle(point,intersectingPoint,i);
            subAreaOfTriangle[i] = getEachArea(pointTriangle);
        }

        return subAreaOfTriangle;
    }

    public static double[] getIntersectingPoint(double[][] point){
        double[] intersectingPoint = new double[2];
        double[] points = new double[6];

        points[0] =  (point[0][1] - point[2][1]);
        points[1] =  -(point[0][0] - point[2][0]);
        points[2] =  (point[1][1] - point[3][1]);
        points[3] =  -(point[1][0] - point[3][0]);

        points[4] = ((point[0][1] - point[2][1]) * point[0][0]) - ((point[0][0] - point[2][0]) * point[0][1]);
        points[5] = ((point[1][1] - point[3][1]) * point[1][0]) - ((point[1][0] - point[3][0]) * point[1][1]);

        intersectingPoint[0] = ((points[4] * points[3]) - (points[1] * points[5])) / ((points[0] * points[3]) - (points[1] * points[2]));
        intersectingPoint[1] = ((points[0] * points[5]) - (points[4] * points[2])) / ((points[0] * points[3]) - (points[1] * points[2]));

        System.out.println(intersectingPoint[0]+"&"+intersectingPoint[1]);
        return intersectingPoint;
    }

    public static double[][] getPointTriangle(double[][] point, double[] intersectingPoint,int indexForArrayPoint){
        double[][] pointTriangle =  new double[3][2];

        for(int row = 0, rowForPoint = indexForArrayPoint; row < pointTriangle.length; row++){
            rowForPoint = rowForPoint % 4;
            for(int col = 0; col < pointTriangle[0].length; col++){

                pointTriangle[row][col] = (row == 0)
                        ? intersectingPoint[col]
                        : point[rowForPoint][col];

                if(row == 0){
                    pointTriangle[row][col] = intersectingPoint[col];
                }else {
                    pointTriangle[row][col] = point[rowForPoint][col];
                }
            }
            if(row > 0){
                rowForPoint++;
            }
        }
        return pointTriangle;
    }

    public static double  getEachArea(double[][] pointTriangle){
        double[] side = new double[3];

        for(int row = 0; row < pointTriangle.length; row++){
            int nextRow = (row + 1) % 3;
            for(int col = 0; col < pointTriangle[0].length; col++){
                side[row] += Math.pow(pointTriangle[row][col] - pointTriangle[nextRow][col], 2);
            }
            side[row] = Math.pow(side[row],0.5);
        }
        double sumOFSide = (side[0] + side[1] + side[2]) / 2;
        return Math.pow(sumOFSide * (sumOFSide - side[0]) * (sumOFSide - side[1]) * (sumOFSide - side[2]), 0.5);
    }

    public static void print(double[] subAreaOfTriangle){
        for(int  i = 0; i < subAreaOfTriangle.length; i++){
            System.out.print(subAreaOfTriangle[i]+" ");
        }
    }
}
