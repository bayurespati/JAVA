package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_45_ch_5_Statistic_compute_mean_and_standard_devitation {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter ten number : ");

        double x = 0;
        double x2 = 0;

        for(int j = 1; j <=10; j++) {
            double number = input.nextDouble();
                x += number;
                x2 += Math.pow(number, 2);
        }

        double mean = x / 10;
        double deviation = Math.pow(((x2 - Math.pow(x, 2) / 10) / 9), 0.5);

        System.out.println("The mean is : "+mean);
        System.out.printf("The Standard deviation : %.5f",deviation);

    }
}
