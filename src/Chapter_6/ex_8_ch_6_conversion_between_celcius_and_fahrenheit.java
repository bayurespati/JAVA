package Chapter_6;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_8_ch_6_conversion_between_celcius_and_fahrenheit {
    public static void main(String[] args) {
        double celsius = 40;
        double fahrenheit = 120;
        printTable(celsius,fahrenheit);
    }

    public static void printTable(double celsius, double fahrenheit){
        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tcelsius");
        for(double i = celsius, j = fahrenheit; i >= 31; i--, j -=10){
            System.out.printf("%.0f\t\t%.2f\t\t|\t%.0f\t\t\t%.2f\n",i,celsiusToFahrenheit(i),j,fahrenheitToCelsius(j));
        }
    }

    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
