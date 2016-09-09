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
        int number = input.nextInt();

        int number9 = number % 10;
        int number8 = (number % 100 - number9) / 10;
        int number7 = (number % 1000 - number8) /100;
        int number6 = (number % 10000 - number7) /1000;
        int number5 = (number % 100000 - number6) /10000;
        int number4 = (number % 1000000 - number5) /100000;
        int number3 = (number % 10000000 - number4) /1000000;
        int number2 = (number % 100000000 - number3) /10000000;
        int number1 = (number % 1000000000 - number2) /100000000;

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
            case 10 : System.out.print("X");
        }
    }
}
