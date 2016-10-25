package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_2_ch_6_sum_the_digit_in_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integer : ");
        long integer = input.nextLong();
        printSum(integer);
    }

    public static void printSum(long integer){
        System.out.println("The sum is : "+(sumDigits(integer)));
    }

    public static int sumDigits(long integer){
        int j = 0;
        for(long i = integer; i > 0; i /=10){
            j += i % 10;
        }
        return j;
    }
}
