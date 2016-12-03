package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 12/3/16.
 */
public class ex_33_ch_7_culture_chinese_zodiac {
    public static void main(String[] args) {
        int year  = getYears();

        printZodiac(year);
    }
    public static int getYears(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter years : ");
        return input.nextInt();
    }

    public static void printZodiac(int year){
        String[] zodiacName = {"Monkey","Rooster","Dog","Pig","Rat","Ox","Tiger","Rabbit","Dragon","Snake","Horse","Sheep"};

        int zodiacYears = year % 12;
        System.out.print("The Zodiac is : ");
        System.out.println(zodiacName[zodiacYears]);

    }
}
