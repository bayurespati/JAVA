package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/9/16.


 */
public class ex_16_ch_3_random_point {
    public static void main(String[] args) {


        int x = (int) (Math.random() * 101)-50;
        int y = (int) (Math.random() * 201)-100;

        System.out.print("centered of rectangle : ("+x+","+y+") with width 100 and height 200");
    }
}
