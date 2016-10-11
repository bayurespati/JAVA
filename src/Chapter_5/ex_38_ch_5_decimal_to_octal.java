package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/11/16.
 */
public class ex_38_ch_5_decimal_to_octal {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.print("Input integer : ");
        int number = input.nextInt();


        String z =" ";
        for(int i = number; i  > 0 ; i /=8){

            int a = i % 8;
            z =a+z;
        }
        System.out.println(z);
    }
}
