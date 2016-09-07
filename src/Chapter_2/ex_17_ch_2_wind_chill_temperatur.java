package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 How cold is it outside? The temperature alone is not enough to provide the answer.
 Other factors including wind speed, rela- tive humidity, and sunshine play important roles in
 determining coldness outside. In 2001, the National Weather Service (NWS) implemented the new wind-chill temperature
 to measure the coldness using temperature and wind speed. The formula is


 twc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16

 where ta is the outside temperature measured in degrees Fahrenheit and v is the speed measured in miles per hour.
 twc is the wind-chill temperature. The formula cannot be used for wind speeds below 2 mph or temperatures below
 -58oF or above 41oF.

 */
public class ex_17_ch_2_wind_chill_temperatur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit between -58F and 41F : ");
        double fahrenheit = input.nextDouble();
        System.out.print("Enter the wind speed (>=2) in miles per hour : ");
        double windSpeed = input.nextDouble();

        double windChillIndex = 35.74 + (0.6215 * fahrenheit) - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * fahrenheit * Math.pow(windSpeed, 0.16) ;

        System.out.printf("The wind chill index is : %.4f ",windChillIndex);
    }
}
