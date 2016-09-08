package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.
 *
 */
public class eg_7_ch_3_leap_year {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);

        System.out.println(year + " is Leap year? "+isLeapYear);
    }
}
