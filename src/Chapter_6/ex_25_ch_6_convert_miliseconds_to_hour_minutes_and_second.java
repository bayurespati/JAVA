package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/29/16.
 */
public class ex_25_ch_6_convert_miliseconds_to_hour_minutes_and_second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input millisecond : ");
        long millisecond = input.nextLong();

        printMilliSecond(millisecond);
    }

    public static void printMilliSecond(long millisecond){
        System.out.println(""+convertMillis(millisecond));
    }

    public static String convertMillis(long millis){

        long totalSecond = millis / 1000;
        long totalMinutes = totalSecond / 60;
        long totalHour = totalMinutes /60;

        long temp = 0;
        String wallHack = ":";
        String time = "";

            temp = getSecond(totalSecond);
            time = wallHack + temp;
            temp = getMinutes(totalMinutes);
            time = temp + time ;
            temp = totalHour;
            time = temp + wallHack + time;

        return time;
    }

    public static long getSecond(long second){
        long secondConvert = second % 60;
        return secondConvert;
    }

    public static long getMinutes(long minute){
        long minuteConvert = minute % 60;
        return minuteConvert;
    }


}
