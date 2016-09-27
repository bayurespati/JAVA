package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/27/16.
 */
public class eg_9_ch_5_greatest_common_divisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int n1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int n2 = input.nextInt();

        int gcd = 1;
        int k = 2;
        while (k <= n1 && k <= n2){
            if(n1 % k == 0 && n2 % k == 0)
                gcd = k;
            k++;
        }
        System.out.println("The greatest common divisor for "+n1+" and "+n2+" is "+gcd);
    }
}
