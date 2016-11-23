package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/23/16.
 */
public class ex_2_ch_7_reverse_the_numbers_entered {
    public static void main(String[] args) {
        printReverse();
    }

    public static void printReverse(){

        int number[] = getNumber();
        System.out.print("The reverse number is : ");

        for(int i = 0; i < number.length; i++){
            System.out.print(number[i] + " ");
        }
    }

    public static int[] getNumber(){
        Scanner input = new Scanner(System.in);

        int[] reverseNumber = new int[10];

        System.out.print("Enter 10 Number : ");

        for(int i = 9; i >= 0; i--){

            int number = input.nextInt();
            reverseNumber[i] =number;
        }
        return reverseNumber;
    }
}
