package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/27/16.
 */
public class ex_22_ch_6_approximate_the_square_root {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        printRoot(input.nextLong());
    }

    public static void printRoot(long number){
        System.out.println(sqrt(number));
    }

    public static double sqrt(long n){

        double lastGuest = 1;
        double nextGuest = (lastGuest + (n / lastGuest)) /2;

        while(isRoot(lastGuest,nextGuest)) {
            lastGuest = nextGuest;
            nextGuest = (lastGuest + (n / lastGuest)) /2;
        }
        return lastGuest;
    }

    public static boolean isRoot(double lastGuest, double nextGuest){
        return nextGuest != lastGuest ||
                nextGuest - lastGuest >= 0.00001;
    }
}
