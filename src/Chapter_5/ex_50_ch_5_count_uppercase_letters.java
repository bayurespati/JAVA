package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_50_ch_5_count_uppercase_letters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String string = input.nextLine();

        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWHXYZ";
        int uppercaseCount = 0;

        for(int i = 0; i < string.length(); i++) {
            String letter = "";
            letter += string.charAt(i);
            if (uppercase.contains(letter)) {
                uppercaseCount++;
            }
        }
        System.out.println("The number of uppercase letter is : "+uppercaseCount);
    }
}
