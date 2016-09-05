package Chapter_1;

/**
 * Created by DWP on 9/5/16.
 Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30 seconds.
 Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
 */
public class ex_10_ch_1_avarage_speed_in_miles {
    public static void main(String[] args) {

        double distance = 14;
        double mile = distance/1.6;
        double hour= 60;
        double min= 45.5;
        double time= min/hour;
        double mileperhour = mile/time;


        System.out.println("speed in miles per hour = " + (mileperhour));
    }
}
