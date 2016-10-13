package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_48_ch_5_process_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter String : ");
        String string = input.nextLine();

        String z = "";
        for(int i = 0; i <= string.length(); i+=2){
            z +=string.charAt(i);
        }

        System.out.println(z);
    }
}
