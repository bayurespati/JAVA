package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/19/16.
 */
public class ex_20_ch_4_Process_a_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input String : ");
        String inputString = input.next();


        System.out.println("Length String is " +inputString.length()+" First char is "+inputString.charAt(0));
    }
}
