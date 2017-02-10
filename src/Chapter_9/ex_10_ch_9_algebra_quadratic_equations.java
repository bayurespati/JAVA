package Chapter_9;

import Chapter_9.libaray_class_chapter_9.QuadraticEquation;

import java.util.Scanner;

/**
 * Created by bnamora on 2/10/17.
 */
public class ex_10_ch_9_algebra_quadratic_equations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c : ");
        double[] point = new double[3];

        for(int i = 0; i < point.length; i++){
            point[i] = input.nextInt();
        }

        QuadraticEquation quadraticEquation =  new QuadraticEquation(point[0],point[1],point[2]);

        if(quadraticEquation.getDiscriminant() > 0)
            System.out.printf("The equation has two root : "+quadraticEquation.getRoot1()+" and "+quadraticEquation.getRoot2());
        else if(quadraticEquation.getDiscriminant() == 0)
            System.out.println("The equation has one root : " +quadraticEquation.getRoot1());
        else
            System.out.println("The equation has no real roots.");
    }
}
