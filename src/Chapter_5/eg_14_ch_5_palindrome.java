package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/28/16.
 */
public class eg_14_ch_5_palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = input.nextLine();


        int low = 0;
        int high = s.length() - 1;

        boolean isPalindrome = true;

        while (low < high){
            if(s.charAt(low) != s.charAt(high)){
                isPalindrome = false;
                break;
            }
            low++;
            high--;
        }
        if(isPalindrome)
            System.out.println(s +" is a Palindrome");
        else
            System.out.println(s +" is not Palindrome");
    }
}
