package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 Convert pounds into kilograms) Write a program that converts pounds into kilo- grams.
 The program prompts the user to enter a number in pounds, converts it to kilograms, and displays the result.
 One pound is 0.454 kilograms. Here is a

 */
public class ex_4_ch_2_convert_pound_into_kilogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter number in pounds : ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;
        System.out.println(pounds+" pounds is "+kilograms+" kilograms");
    }
}
