package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/16/16.
 */
public class ex_12_ch_4_hex_to_binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex Digit : ");
        String hexDigit = input.nextLine();

        int digit = hexDigit.charAt(0);

        if(digit >= 'A' && digit <= 'F'){
             digit = digit - 55;
        }
        int binary1 =digit % 2;
        int binaryDivided1 = digit / 2;
        int binary2 = binaryDivided1 % 2;
        int binaryDivided2 = binaryDivided1 / 2;
        int binary3 = binaryDivided2 % 2;
        int binaryDivided3 = binaryDivided2 / 2;
        int binary4 = binaryDivided3 % 2;

        System.out.println(" "+binary4+binary3+binary2+binary1);

    }
}
