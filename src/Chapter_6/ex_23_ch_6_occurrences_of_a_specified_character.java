package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/27/16.
 */
public class ex_23_ch_6_occurrences_of_a_specified_character {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input String : ");
        String sentence = input.nextLine();
        System.out.print("Input Specified character : ");
        String specified = input.next();

        char a = specified.charAt(0);

        printSpecifiedCharacter(sentence,a);
    }

    public static void printSpecifiedCharacter(String character, char a){
        System.out.println("Number of Specified character is : "+count(character,a));
    }

    public static int count(String str, char a){
        int characterCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(a == str.charAt(i)){
                characterCount ++;
            }
        }
        return characterCount;
    }
}
