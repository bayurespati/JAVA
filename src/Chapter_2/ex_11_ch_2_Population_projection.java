package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 Rewrite Programming Exercise 1.11 to prompt the user to enter the number of years and
 displays the population after the number of years. Use the hint in Programming Exercise 1.11 for this program.
 The population should be cast into an integer.

 */
public class ex_11_ch_2_Population_projection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of year : ");
        double numberOfYears = input.nextDouble();

        double population = 312032486;
        double year = 3600 * 24 * 365 * numberOfYears;
        double birth= year/7;
        double death= year/13;
        double immigrant= year/45;
        double total = birth+immigrant-death;
        double population1= population+total;

        System.out.println("the Population in " +numberOfYears+" years : "+population1 );

    }
}
