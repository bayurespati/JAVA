package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/13/16.

 */
public class ex_30_ch_3_Current_time {
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

        if(hour > 11){
            double hourPm = hour % 12;
            System.out.print("Current time is   "+(int)+hourPm+" : "+currentMinutes+" : "+currentSecond+ " PM");
        }
        else
            System.out.print("Current time is   "+(int)+hour+" : "+currentMinutes+" : "+currentSecond+ " AM");
    }
}
