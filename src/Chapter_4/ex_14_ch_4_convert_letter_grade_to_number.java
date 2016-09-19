package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/19/16.
 *
 */
public class ex_14_ch_4_convert_letter_grade_to_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter a latter grade : ");
        String letter = input.next();

        //boolean numeric = (letter.charAt(0) >= 'A' && letter.charAt(0) <= 0);


        int numericValue = letter.charAt(0) - 70;

        if (numericValue == 0){
            System.out.println("The numeric value for grade " + letter + " is " + numericValue);
        }
        else if (numericValue == -5){
                int nvForAUntilE = numericValue + 9;
                System.out.println("The numeric value for grade " + letter + " is " + nvForAUntilE);
        }
        else if (numericValue == -4){
            int nvForAUntilE = numericValue + 7;
            System.out.println("The numeric value for grade " + letter + " is " + nvForAUntilE);
        }
        else if (numericValue == -3){
            int nvForAUntilE = numericValue + 5;
            System.out.println("The numeric value for grade " + letter + " is " + nvForAUntilE);
        }
        else if (numericValue == -2){
            int nvForAUntilE = numericValue + 3;
            System.out.println("The numeric value for grade " + letter + " is " + nvForAUntilE);
        }
        else
        System.out.printf(letter+" is an invalid grade");
    }
}
