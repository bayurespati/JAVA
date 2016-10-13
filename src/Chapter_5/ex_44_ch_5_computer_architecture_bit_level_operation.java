package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_44_ch_5_computer_architecture_bit_level_operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer : ");
        short integer = input.nextShort();

        String a ="";
        for(int i =1; i<=16; i++){
            a = (integer & 1) + a;
            integer >>= 1;
        }
        System.out.println(a);
    }
}
