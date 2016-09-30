package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/29/16.
 */
public class ex_14_ch_5_Compute_the_greatest_common_divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = 1;
        int d;
        if(n1 < n2){
            d = n1;
        }
        else
            d = n2;
        while(d != 0){
            if(n1 % d == 0 && n2 % d == 0){
                gcd = d;
                break;
            }
            d--;
        }
        System.out.println("Bir : "+gcd);

    }
}
