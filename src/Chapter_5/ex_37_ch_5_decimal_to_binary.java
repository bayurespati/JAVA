package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/10/16.
 */
public class ex_37_ch_5_decimal_to_binary {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Input integer : ");
        int number = input.nextInt();


        String z =" ";
        for(int i = number; i  > 0 ; i /=2){

            int a = i % 2;
            z =a+z;
        }
        System.out.println(z);
    }
}
