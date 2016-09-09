package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/10/16.

 */
public class ex_20_ch_3_Science_wind_chill_temperatur {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperatures between -58F and 41F : ");
        double temperatures = input.nextDouble();
        System.out.print("Enter wind speed greater than or equal to 2 : ");
        int windSpeed = input.nextInt();

        double windChillIndex = 35.74 + (0.6215 * temperatures) - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperatures * Math.pow(windSpeed, 0.16);

        boolean valid = (temperatures > - 57 && temperatures < 41) && (windSpeed > 2);

        if(valid){
            System.out.print("the wind chill temperature : " +windChillIndex);
        }
        else
            System.out.println("temperature or wind invalid");
    }
}
