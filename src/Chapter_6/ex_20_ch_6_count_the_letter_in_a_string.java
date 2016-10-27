package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/27/16.
 */
public class ex_20_ch_6_count_the_letter_in_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");

        printNumberOfString(input.nextLine());
    }

    public static void printNumberOfString(String charater){
        System.out.println("Number of letter in string is "+counterLetters(charater));
    }

    public static int counterLetters(String s){

        int countLetter = 0;
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetter(s.charAt(i)))
                countLetter ++;
        }

        return countLetter;
    }
}
