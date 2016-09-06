package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a double value from the console,
 then converts it to Fahrenheit and displays the result. The formula for the conversion is as follows:
 fahrenheit = (9 / 5) * celsius + 32
 Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 */
public class ex_1_ch_2_Convert_celsius_to_fahrenheit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter degree in celsius : ");
        double celsius= input.nextDouble();

        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println(celsius+" celsius is "+fahrenheit+" in fahrenheit" );
    }
}
