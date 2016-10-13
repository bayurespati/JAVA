package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_46_ch_5_reverse_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String : ");
        String string = input.next();
        String a = "";
        int g = string.length();
        for(int i = 1; i <= string.length(); i++ ){
            g--;
           a+=string.charAt(g);

        }
        System.out.println("The reserved string is : "+a);
    }
}
