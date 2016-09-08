package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.


 */
public class eg_1_ch_3_listing_3_1 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis()%10);
        int number2 = (int)(System.currentTimeMillis()/7%10);

        Scanner input = new Scanner(System.in);

        System.out.print("what is "+number1+"+"+number2+"?");
        int answer = input.nextInt();


        System.out.print(number1+" + "+number2+" = "+answer+ " is "+(number1+number2 == answer));
    }
}
