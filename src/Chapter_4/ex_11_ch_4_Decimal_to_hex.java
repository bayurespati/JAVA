package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/16/16.
 *
 */
public class ex_11_ch_4_Decimal_to_hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.printf("Enter a Decimal value(0 to 15) : ");
        int decimalValue = input.nextInt();



        if(decimalValue < 10){
            System.out.println("The hex value is : "+decimalValue);
        } else if (decimalValue > 9 && decimalValue <= 15){
            int charValue = decimalValue + 55;
            System.out.println("The hex value is : "+(char)charValue);
        }
        else
            System.out.println("Fuck you");
    }
}
