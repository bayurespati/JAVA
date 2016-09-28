package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/28/16.
 */
public class ex_1_ch_5_count_positive_and_negative_number_and_compute_the_avarage_of_number {
    public static void main(String[] args) {
        double data;
        double sum = 0;
        double count = -1;
        int positive = 0;
        int negative = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum +=data;
            count++;
            if(data<0) {
                negative++;
            }
            if(data>0){
                positive++;
            }
        }while (data !=0);


        double avg = sum / count;
        System.out.println("Positive :"+positive);
        System.out.println("Negative :"+negative);
        System.out.println("The total is :"+sum);
        System.out.printf("The avg is :"+avg);
    }
}
