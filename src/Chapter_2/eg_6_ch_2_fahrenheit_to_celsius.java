package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 */
public class eg_6_ch_2_fahrenheit_to_celsius {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a degree in fahrenheit : ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.print("fahrenheit "+fahrenheit+" is "+celsius+" in celsius");
    }
}
