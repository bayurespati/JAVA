package Chapter_1;

/**
 * Created by DWP on 9/5/16.
 Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds.
 Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)

 */
public class ex_12_ch_1_avarage_speed_in_kilometers {
    public static void main(String[] args) {
        double kilometer = 24 * 1.6;
        double hour = (60.0/60)+(40.0/60)+(35.0/3600);
        double average = kilometer /hour;

        System.out.printf("average kilometer per hour = " + (average));
    }
}
