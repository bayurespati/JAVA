package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_49_ch_5_count_vowels_and_consonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String string = input.nextLine();

        String vocal = "aiueoAIUEO";
        String consonant = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        int vowelCount = 0;
        int consonantCount = 0;
        for(int i = 0; i < string.length(); i++){
            String letter = "";
            letter += string.charAt(i);

            if(vocal.contains(letter)){
                vowelCount ++;
            }
            if(consonant.contains(letter)){
                consonantCount ++;
            }

        }
        System.out.println("The number of vowel is : "+vowelCount);
        System.out.println("The number of consonant is : "+consonantCount);
    }
}
