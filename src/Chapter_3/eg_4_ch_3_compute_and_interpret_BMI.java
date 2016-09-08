package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.


 */
public class eg_4_ch_3_compute_and_interpret_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        System.out.println("Enter height in inches: ");
        double heigth = input.nextDouble();

        final double KILOGRAM_PER_POUND = 0.45359237;
        final double METER_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAM_PER_POUND;
        double heigthInMeters = heigth * METER_PER_INCH;
        double bmi = weightInKilograms/(heigthInMeters * heigthInMeters);

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
