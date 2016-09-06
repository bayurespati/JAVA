package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 Write a program that prompts the user to enter the minutes (e.g., 1 billion),
 and displays the number of years and days for the min- utes. For simplicity, assume a year has 365 days

 */
public class ex_7_ch_2_Find_number_of_years {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number OF minutes : ");
        int minutes = input.nextInt();

        int hour = minutes / 60;
        int day = hour / 24;
        int dayOfYears = day % 365;
        int years = day / 365;

        System.out.println(minutes+" minutes is approximately "+years+" years and "+dayOfYears+" days ");
    }

}
