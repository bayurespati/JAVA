package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/10/16.
 */
public class ex_26_ch_3_use_operator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        int number = input.nextInt();



        boolean test1 = (number % 5 ==  0) && (number % 6 == 0);
        boolean test2 = (number % 5 == 0)|| (number % 6 == 0);
        boolean test3 = (number % 5 ==0) ^ (number % 6 == 0);

        System.out.print(" is "+ number);
        System.out.println( " divisible by 5 and 6 " + test1);
        System.out.print(" is "+ number);
        System.out.println( " divisible by 5 and 6 " + test2);
        System.out.print(" is "+ number);
        System.out.println( " divisible by 5 and 6, but not both " + test3);
    }

}
