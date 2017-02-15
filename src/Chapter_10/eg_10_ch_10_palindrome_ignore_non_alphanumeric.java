package Chapter_10;

import java.util.Scanner;

/**
 * Created by bnamora on 2/15/17.
 */
public class eg_10_ch_10_palindrome_ignore_non_alphanumeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String s = input.nextLine();

        System.out.println("Ignoring nonalphanumeric character, \n "+s+" a palindrome "+isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        String s1 = filter(s);

        String s2 = reverse(s1);

        return s1.equals(s2);
    }

    public static String filter(String s){
        StringBuilder stringBuilder =  new StringBuilder();

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();
    }

    public static String reverse(String s){
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
