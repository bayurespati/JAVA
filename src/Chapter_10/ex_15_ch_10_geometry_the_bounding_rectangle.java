package Chapter_10;

import Chapter_10.library_class_chapter_10.MyRectangle2D;

import java.util.Scanner;

/**
 * Created by bnamora on 2/20/17.
 */
public class ex_15_ch_10_geometry_the_bounding_rectangle {
    public static void main(String[] args) {
        double[][] points = getPoint();
        MyRectangle2D rectangle2D = MyRectangle2D.getRectangle(points);
        System.out.println("The Bounding rectangle center ("+rectangle2D.getX()+","+rectangle2D.getY()+"), width "+rectangle2D.getWidth()+" height "+rectangle2D.getHeight());
    }
    public static double[][] getPoint(){
        Scanner input = new Scanner(System.in);
        double[][] points = new double[5][2];
        System.out.print("Enter Five Point : ");
        for(int row = 0; row < points.length; row++){
            for(int col = 0; col < points[0].length; col++){
                points[row][col] = input.nextDouble();
            }
        }
        return points;
    }
}
