package Chapter_2;

import java.util.Scanner;

/**
 * Created by DWP on 9/6/16.
 */
public class eg_5_ch_2_display_time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter an integer for second: ");
        int second = input.nextInt();

        int minutes = second /60;
        int remainingSecond = second % 60;

        System.out.print(second+" second is "+minutes+" minutes and "+remainingSecond+" seconds ");
    }
}
