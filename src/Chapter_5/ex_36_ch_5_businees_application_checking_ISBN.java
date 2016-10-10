package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/10/16.
 */
public class ex_36_ch_5_businees_application_checking_ISBN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 9 digit of an ISBN as integer: ");
        int number = input.nextInt();
        int checkSum = 0;

        System.out.printf("The number is : ");

        for(int i = 1, j = 100000000 ; i <= 9; i++, j /=10){

            int printNumber = (number / j)%10;
            System.out.print(printNumber);
            checkSum += printNumber*i;
        }

        int sum = checkSum % 11;
        System.out.println((sum == 10)
                ?"X"
                :+sum);
    }
}
