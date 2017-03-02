package Chapter_12;

import java.util.Scanner;

/**
 * Created by bnamora on 3/2/17.
 */
public class eg_2_ch_12_quotient_with_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integer : ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if(number2 != 0){
            System.out.println(number1+" / "+number2+" is "+(number1 / number2));
        }else
            System.out.println("Divisor cannot be zero ");
    }
}
