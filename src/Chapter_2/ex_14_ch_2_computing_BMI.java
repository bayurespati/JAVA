package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and
 dividing by the square of your height in meters. Write a program that prompts the user to enter a weight in pounds and
 height in inches and displays the BMI. Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

 */
public class ex_14_ch_2_computing_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double kilogramInPound = 0.45359237;

        System.out.print("Enter weight in pounds : ");
        double weight = input.nextDouble() * kilogramInPound;
        System.out.print("Enter Height in inches : ");
        double height = input.nextDouble();

        double meterInInch = 0.0254;


        double total = (weight)/ Math.pow((height * meterInInch), 2);

        System.out.print("BMI is : "+total);
    }
}
