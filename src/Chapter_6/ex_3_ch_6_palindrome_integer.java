package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_3_ch_6_palindrome_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input integer : ");
        int number = input.nextInt();
        printPalindrome(number);
    }
    public static void printPalindrome(int number){
        if(isPalindrome(number)){
            System.out.println("number is Palindrome : "+number);
        }
        else
            System.out.println("number is not Palindrome : "+number);
    }
    public static int reverse(int number){
        int lengthOfNumber = 1;
        for(int i = number; i > 0; i /=10){
           lengthOfNumber *= 10;
        }
        int reverseNumber = 0;
        int g = lengthOfNumber /10;
        for(int i = number, k = g; i > 0; i /=10, k /=10){
            int z = i % 10;
            reverseNumber += z * k;
        }
        return reverseNumber;
    }
    public static boolean isPalindrome(int number){
       return number == reverse(number);
    }
}
