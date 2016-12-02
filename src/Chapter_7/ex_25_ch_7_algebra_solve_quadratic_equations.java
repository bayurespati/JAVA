package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 12/2/16.
 (Algebra: solve quadratic equations) Write a method for solving a quadratic equation using the following header:
 public static int solveQuadratic(double[] eqn, double[] roots)
 The coefficients of a quadratic equation ax2 + bx + c = 0 are passed to the array eqn and the real roots are
 stored in roots. The method returns the num- ber of real roots. See Programming Exercise 3.1 on how to solve
 a quadratic equation.
 Write a program that prompts the user to enter values for a, b, and c and displays
 the number of real roots and all real roots.
 */
public class ex_25_ch_7_algebra_solve_quadratic_equations {
    public static void main(String[] args) {
        double[] eqn = getEqn();
        double[] roots = new double[2];

        int number = solveQuadratic(eqn,roots);

        print(roots,number);
    }

    public static double[] getEqn(){
        Scanner input =  new Scanner(System.in);

        double[] eqn = new double[3];

        System.out.print("Input value for a,b,c : ");

        for(int i = 0; i < eqn.length; i++) {
            eqn[i] = input.nextDouble();
        }
        return eqn;
    }

    public static int solveQuadratic(double[] eqn,double[] roots){

        double number = Math.pow(eqn[1], 2)-(4 * eqn[0] * eqn[2]);
        roots[0] = (-eqn[1] + Math.pow(number, 0.5)) / (2 * eqn[0]);
        roots[1] = (-eqn[1] - Math.pow(number, 0.5)) / (2 * eqn[0]);

        return (int) number;
    }

    public static void print(double[]roots ,int number){

        System.out.println("Number of roots : "+number);
        if(number > 0)
            System.out.printf("The equation has two root : "+roots[0]+" and "+roots[1]);
        else if(number == 0)
            System.out.println("The equation has one root : " +(int)roots[0]);
        else
            System.out.println("The equation has no real roots.");
    }
}
