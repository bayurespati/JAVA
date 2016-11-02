package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/2/16.
 */
public class eg_1_ch_7_analyze_numbers {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the number of times: ");
        int n = input.nextInt();

        double[] number = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for(int i = 0; i < n; i++){
            number[i] = input.nextDouble();
            sum +=number[i];
        }

        double average = sum / n;

        int count = 0;
        for(int i = 0; i < n; i++){
            if(number[i] > average)
                count++;
        }

        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is: "+count);
    }
}
