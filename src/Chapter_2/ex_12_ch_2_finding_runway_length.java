package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 */
public class ex_12_ch_2_finding_runway_length {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter speed and acceleration : ");
        double speed = input.nextDouble();
        double acceleration = input.nextDouble();

        double length = Math.pow(speed, 2)/(2 * acceleration);

        System.out.print("The minimum runway length for this airplane is : "+ length);
    }
}
