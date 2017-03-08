package Chapter_12;

import Chapter_12.library_class_chapter_12.BinaryFormatException;

import java.util.Scanner;

/**
 * Created by bnamora on 3/8/17.
 */
public class ex_9_ch_12_bin2dec_withCostumException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Input binary number : ");
            String binaryNumber = input.next();
            try {
                isValid(binaryNumber);
                System.out.println("The Decimal Value for Binary Number " + binaryNumber + " is " + binaryToDecimal(binaryNumber));
                break;
            } catch (BinaryFormatException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static boolean isValid(String binaryNumber) throws BinaryFormatException {
        for(int i = 0; i < binaryNumber.length(); i++ ){
            if(binaryNumber.charAt(i) != '0' && binaryNumber.charAt(i) != '1')
                throw new BinaryFormatException();
        }
        return true;
    }

    public static int binaryToDecimal(String binaryNumber){
        int decimal = binaryNumber.charAt(binaryNumber.length() - 1) == 1 ? 1 : 0;
        for(int i = binaryNumber.length() - 2,number  = 1; i >= 0; i--, number++){
            if(binaryNumber.charAt(i) == '1'){
                decimal += Math.pow(2,number);
            }
        }
        return decimal;
    }
}
