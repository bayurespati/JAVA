package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.


 */
public class ex_3_ch_4_solve_2x2_linear_equations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c, d, e, f : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = ((e*d)-(b*f))/((a*d)-(b*c));
        double y = ((a*f)-(e*c))/((a*d)-(b*c));

        double number = (a*d)-(b*c);

        if(number !=0)
            System.out.print("x is : "+x+" and y is : "+y);
        else
            System.out.println("The equation has no solution");
    }
}
