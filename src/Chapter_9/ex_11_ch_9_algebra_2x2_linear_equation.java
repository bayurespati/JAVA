package Chapter_9;

import Chapter_9.libaray_class_chapter_9.LinerEquations;

import java.util.Scanner;

/**
 * Created by bnamora on 2/10/17.
 */
public class ex_11_ch_9_algebra_2x2_linear_equation {
    public static void main(String[] args) {
        double[] point = getPoint();
        LinerEquations linerEquations = new LinerEquations(point[0],point[1],point[2],point[3],point[4],point[5]);
        System.out.println((linerEquations.isSolvable() == 0)
                ? "The equation has no solution"
                : "x is : "+linerEquations.getX()+" and y is : "+linerEquations.getY());
    }

    public static double[] getPoint(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c, d, e, f : ");
        double[] point = new double[6];
        for(int i = 0; i < point.length; i++){
            point[i] = input.nextDouble();
        }
        return point;
    }
}
