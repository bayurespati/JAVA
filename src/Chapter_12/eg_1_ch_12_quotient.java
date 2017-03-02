package Chapter_12;

import java.util.Scanner;

/**
 * Created by bnamora on 3/2/17.
 */
public class eg_1_ch_12_quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        System.out.println(number1+" / "+number2+" is "+(number1/number2));
    }
}
