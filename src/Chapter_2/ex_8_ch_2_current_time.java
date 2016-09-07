package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/7/16.
 ShowCurrentTime.java, gives a program that displays the current time in GMT.
 Revise the program so that it prompts the user to enter the time zone offset to GMT and
 displays the time in the specified time zone

 */
public class ex_8_ch_2_current_time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter time zone offset to GTM : ");
        int time = input.nextInt();


        long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;
        long hour = currentHour + time;

        System.out.print("Current time is   "+hour+" : "+currentMinutes+" : "+currentSecond+ " GMT");


    }
}
