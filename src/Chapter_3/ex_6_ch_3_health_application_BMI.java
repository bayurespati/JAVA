package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.

 */
public class ex_6_ch_3_health_application_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds : ");
        double weight = input.nextDouble();

        System.out.print("Enter Feet : ");
        double feet = input.nextDouble();

        System.out.print("Enter inches : ");
        double inch = input.nextDouble();


        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;
        final double METER_PER_FEET = 0.3048;

        double weightInKilograms = weight * KILOGRAM_PER_POUND;
        double feetInMeter = feet * METER_PER_FEET;
        double inchInMeter = inch * METER_PER_INCH;
        double heightInMeters = feetInMeter + inchInMeter;

        double bmi = weightInKilograms/(heightInMeters * heightInMeters);

        System.out.println("BMI is "+ bmi);

        if(bmi < 18.5)
            System.out.println("Underweight");
        else if (bmi < 25)
            System.out.println("Normal");
        else if (bmi < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }
}
