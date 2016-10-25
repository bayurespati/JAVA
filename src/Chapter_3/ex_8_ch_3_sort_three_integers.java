package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.
 *
 */
public class ex_8_ch_3_sort_three_integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three integer : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();


        if(number1 > number2){
            int tempt = number1;
            number1 = number2;
            number2 = tempt;
        }
        if(number1 > number3){
            int temp = number1;
            number1 = number3;
            number3 = temp;
        }
        if(number2 > number3){
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }
        if(number1 > number2){
            int tempt = number1;
            number1 = number2;
            number2 = tempt;
        }

        System.out.println(" the number is : "+number1+" "+number2+" "+number3);
    }
}
