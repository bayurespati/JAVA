package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/27/16.
 */
public class eg_6_ch_5_test_do_while {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();

            sum +=data;
        }while (data !=0);
        System.out.println("The sum is "+ sum);
    }
}
