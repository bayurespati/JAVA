package Chapter_2;

/**
 * Created by DWP on 9/6/16.
 */
public class eg_7_ch_2_Show_current_time {
    public static void main(String[] args) {
        long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        long currentSecond = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        long currentHour = totalHour % 24;

        System.out.print("Current time is  "+currentHour+" : "+currentMinutes+" : "+currentSecond+ " GMT");
    }
}
