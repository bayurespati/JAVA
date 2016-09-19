package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/19/16.
 *
 */
public class ex_15_ch_4_Phone_key_pads {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter : ");
        String letter = input.next();

        String s1 = "ABCabc";
        String s2 = "DEFdef";
        String s3 = "GHIghi";
        String s4 = "Jkljkl";
        String s5 = "MNOmno";
        String s6 = "PQRSpqrs";
        String s7 = "TUVtuv";
        String s8 = "WXYZwxyz";


        if(letter.charAt(0) < 'A' || letter.charAt(0) > 'z'){
            System.out.println(letter+" Is an invalid input");
        }
        else {
            System.out.print("The corresponding number is : ");
            if (s1.contains(letter))
                System.out.println("2");
            else if (s2.contains(letter))
                System.out.println("3");
            else if (s3.contains(letter))
                System.out.println("4");
            else if (s4.contains(letter))
                System.out.println("5");
            else if (s5.contains(letter))
                System.out.println("6");
            else if (s6.contains(letter))
                System.out.println("7");
            else if (s7.contains(letter))
                System.out.println("8");
            else if (s8.contains(letter))
                System.out.println("9");
        }
    }
}
