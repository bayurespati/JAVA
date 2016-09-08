package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.
 *
 */
public class ex_1_ch_3_solve_quadratic_equations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double number = Math.pow(b, 2)-(4 * a * c);


        double root1 = (-b + Math.pow(number, 0.5)) / (2 * a);
        double root2 = (-b - Math.pow(number, 0.5)) / (2 * a);

        if(number > 0)
            System.out.printf("The equation has two root : "+root1+" and "+root2);
        else if(number == 0)
            System.out.println("The equation has one root : " +(int)root1);
        else
            System.out.println("The equation has no real roots.");
    }
}
