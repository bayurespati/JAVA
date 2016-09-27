package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/27/16.
 *
 */
public class eg_5_ch_5_sentinel_value {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (the input ends if it is 0): ");
        int data = input.nextInt();

        int sum = 0;
        while(data !=0){
            sum += data;
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
        }
        System.out.println("The sum is "+sum);
    }
}
