package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.
 */
public class ex_2_ch_3_add_three_number {
    public static void main(String[] args) {


        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 7 % 10);
        int number3 = (int) (System.currentTimeMillis() / 12 % 10 );

        Scanner input = new Scanner(System.in);

        System.out.print("what is " + number1 + " + " + number2 + " + " +number3+" ? ");
        int answer = input.nextInt();


        System.out.print(number1 + " + " + number2 + " + "+ number3+" = " + answer + " is " + (number1 + number2 + number3 == answer));
    }
}
