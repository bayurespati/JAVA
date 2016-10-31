package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/31/16.
 */
public class ex_31_ch_6_financial_credit_card_number_validation {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);


        System.out.print("Enter a credit card number as a long Integer : ");
        String ccNumber = input.nextLine();

        if(isValid(ccNumber) && prefixMatched(ccNumber)){
            System.out.println(ccNumber+" is Valid");
        }
        else
            System.out.println(ccNumber+"Fuck Yeah");
    }



    public static boolean isValid(String ccNumber){
        return getSize(ccNumber) >= 13 && getSize(ccNumber) <= 16 &&
                (sumOfDoubleEvenPlace(ccNumber) + sumOfOddPlace(ccNumber) ) % 10 == 0
                ;

    }

    public static int sumOfDoubleEvenPlace(String number){
        int evenNumber = 0;
        for(int i = 0; i <number.length(); i+=2){

            int temp= (number.charAt(i) - 48) * 2;

            if(temp >= 10) {
                evenNumber += getDigit(temp);
            }
            else
                evenNumber += temp;

        }
        return evenNumber;
    }

    public static int getDigit(int number){
        return (number % 10) + 1;
    }

    public static int sumOfOddPlace(String number){
        int oddNumber = 0;

        for(int i = 1; i < number.length(); i+=2){
            oddNumber += (number.charAt(i) - 48);
        }
        return oddNumber;
    }

    public static boolean prefixMatched(String number){
        return getPrefix(number) == 4 ||
                getPrefix(number) == 5 ||
                getPrefix(number) == 37 ||
                getPrefix(number) == 6;
    }

    public static long getPrefix(String number){
        int b = number.charAt(0)-48;
        int z = number.charAt(1)-48;
        if(b == 3 ){
            b = (b * 10 ) + z;
        }

        return b;
    }

    public static int getSize(String d){
        return d.length();
    }

}
