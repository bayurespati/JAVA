package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 Write a program that prompts the user to enter the starting velocity v0 in meters/ second,
 the ending velocity v1 in meters/second, and the time span t in seconds, and displays the average acceleration

 */
public class ex_9_ch_2_physics_acceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter V0,V1 and t : ");
        double V0 = input.nextDouble();
        double V1 = input.nextDouble();
        double t = input.nextDouble();


        double average = (V1 - V0) / t;

        System.out.println("The average acceleration is : "+average);
    }
}
