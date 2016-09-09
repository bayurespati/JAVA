package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/9/16.
 Formula (d1 *1+d2 *2+d3 *3+d4 *4+d5 *5+ d6 *6+d7 *7+d8 *8+d9 *9)%11

 *
 */
public class ex_9_ch_3_business_check_ISBN_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the first 9 digit of an ISBN as integer: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        int number6 = input.nextInt();
        int number7 = input.nextInt();
        int number8 = input.nextInt();
        int number9 = input.nextInt();

        int checkSum = (number1 * 1 + number2 * 2 + number3 * 3 + number4 *
                4 + number5 * 5 + number6 * 6 +number7 * 7 +number8* 8 + number9*9 )%11;

        System.out.print("The ISBN-10 number is "+number1+number2+number3+number4+number5+number6+number7+number8+number9);

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
            case 10 : System.out.print("x");
        }
    }
}
