package Chapter_11;

import Chapter_10.library_class_chapter_10.MyPoint;
import Chapter_10.library_class_chapter_10.Triangle2d;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_15__ch_11_area_of_a_convex_polygon {
    public static void main(String[] args) {
        double[] point = getPoint();
        ArrayList<Triangle2d> triangle = getTriangle(point);
        double area = getArea(triangle);
        System.out.println("Area : "+area);
    }

    public static double[] getPoint(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of the point : ");
        int numberOfPoint = input.nextInt();

        double[] point = new double[numberOfPoint * 2];
        System.out.println("Enter the coordinates of the points : ");
        for(int i = 0; i < point.length; i++){
            point[i] = input.nextDouble();
        }

        return point;
    }

    public static ArrayList<Triangle2d> getTriangle(double[] point){
        ArrayList<Triangle2d> triangle = new ArrayList<>();
        for(int  index1 = 2, index2 = 3; index2 < point.length - 2; index1 += 2,index2 += 2){
            triangle.add(new Triangle2d(new MyPoint(point[0], point[1]), new MyPoint(point[index1], point[index2]), new MyPoint(point[index1 + 2],point[index2 + 2])));
        }
        return triangle;
    }

    public static double getArea(ArrayList<Triangle2d> triangle){
        double area = 0;
        for (Triangle2d triangles: triangle)
            area += triangles.getArea();
        return area;
    }
}
