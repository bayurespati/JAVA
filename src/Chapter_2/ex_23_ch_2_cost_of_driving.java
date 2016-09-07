package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 Write a program that prompts the user to enter the distance to drive,
 the fuel efficiency of the car in miles per gallon, and the price per gallon,
 and displays the cost of the trip.

 */
public class ex_23_ch_2_cost_of_driving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance : ");
        double distance = input.nextDouble();

        System.out.print("Enter miles per gallon : ");
        double milePerGalon = input.nextDouble();

        System.out.print("price per gallon : ");
        double pricePerGallon = input.nextDouble();

        double cost = (distance / milePerGalon) * pricePerGallon;

        System.out.printf("The cost of driving is $ %.2f",cost);

    }
}
