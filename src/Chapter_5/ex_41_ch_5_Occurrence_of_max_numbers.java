package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_41_ch_5_Occurrence_of_max_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter number : ");
        int number = -1;
        int maxNumber = 0;
        int count = 0;
        while (number != 0){
            number = input.nextInt();

            if(number > maxNumber){
                maxNumber = number;
                count = 1;
            }
            else if(maxNumber == number){
                count ++;
            }
        }

        System.out.println("The Occurrence count of the largest number is : "+count);
        System.out.println("The large number is  : "+maxNumber);
    }
}
