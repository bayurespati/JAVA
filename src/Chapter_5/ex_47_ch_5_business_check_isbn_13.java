package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_47_ch_5_business_check_isbn_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digit of an ISBN-13 as a string : ");
        String digit = input.next();


        int a = 0;
        int b = 0;

        if(digit.length() < 12){
            System.out.println(digit+" is an invalid input");
        }
        else
            {
                for(int i = 1; i <= 12; i++){
                    int z = digit.charAt(b) - 48;
                    if(i % 2 == 0 && i !=1){
                      a += 3 * z;
                     }
                    else
                        a += z;
                     b++;
                }
                System.out.print("The ISBN number is : " + digit);
                int sum = 10 - (a % 10);
                System.out.println((sum == 10)
                        ?"X"
                        :+sum);
        }
    }
}
