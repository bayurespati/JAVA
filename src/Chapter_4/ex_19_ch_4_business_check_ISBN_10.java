package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/19/16.
 */
public class ex_19_ch_4_business_check_ISBN_10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first 9 digit of an ISBN as integer: ");
        String integerIsbn = input.nextLine();

        int number1 = integerIsbn.charAt(0);
        int number2 = integerIsbn.charAt(1);
        int number3 = integerIsbn.charAt(2);
        int number4 = integerIsbn.charAt(3);
        int number5 = integerIsbn.charAt(4);
        int number6 = integerIsbn.charAt(5);
        int number7 = integerIsbn.charAt(6);
        int number8 = integerIsbn.charAt(7);
        int number9 = integerIsbn.charAt(8);

        int checkSum = (number1 * 1 + number2 * 2 + number3 * 3 + number4 *
                4 + number5 * 5 + number6 * 6 +number7 * 7 +number8 * 8 + number9 * 9 )%11;

        System.out.print("The ISBN-10 number is "+integerIsbn);

        switch (checkSum){
            case 1 : System.out.print("1"); break;
            case 2 : System.out.print("2"); break;
            case 3 : System.out.print("3"); break;
            case 4 : System.out.print("4"); break;
            case 5 : System.out.print("5"); break;
            case 6 : System.out.print("6"); break;
            case 7 : System.out.print("7"); break;
            case 8 : System.out.print("8"); break;
            case 9 : System.out.print("9"); break;
            case 10 : System.out.print("X");
        }
    }
}
