package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_6_ch_6_display_pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Line : ");
        displayPattern(input.nextInt());
    }

    public static void displayPattern(int line){
        for(int i = 1; i <= line; i++) {
            for (int k = line; k > i; k--) {
                System.out.print("  ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.printf("%2d",k);
            }
            System.out.println();
        }
    }
}
