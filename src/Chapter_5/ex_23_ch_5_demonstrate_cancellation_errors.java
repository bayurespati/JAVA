package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/3/16.
 */
public class ex_23_ch_5_demonstrate_cancellation_errors {
    public static void main(String[] args) {
        double k = 0;
        for(double n = 50000; n >1; n--){
            k += 1/n;
        }
        System.out.println(k+1);
    }
}
