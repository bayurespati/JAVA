package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/27/16.
 */
public class ex_21_ch_6_phone_keypads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        printPhoneNumber(input.nextLine().toUpperCase());
    }

    public static void printPhoneNumber(String character){
        System.out.println(""+getNumber(character));
    }

    public static String getNumber (String character){
        String phoneNumber = "";
        for(int i = 0 ; i < character.length(); i++){
            if(Character.isLetter(character.charAt(i))){
                phoneNumber += getNumbers(character.charAt(i));
            }
            else
                phoneNumber += character.charAt(i);
        }
        return phoneNumber;
    }

    public static int getNumbers (char letter){

        int m = 0;

        if(letter >= 'A' && letter <= 'C')
            m = 2;
        else if (letter >= 'D' && letter <= 'F')
            m = 3;
        else if (letter >= 'G' && letter <= 'I')
            m = 4;
        else if (letter >= 'J' && letter <= 'L')
            m = 5;
        else if (letter >= 'M' && letter <= 'O')
            m = 6;
        else if (letter >= 'P' && letter <= 'S')
            m = 7;
        else if (letter >= 'T' && letter <= 'V')
            m = 8;
        else if (letter >= 'W' && letter <= 'Z')
            m = 9;

        return m;
    }
}
