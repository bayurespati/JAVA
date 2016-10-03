package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/30/16.
 */
public class ex_19_ch_5_display_number_in_a_pyramid_pattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input line : ");
        int line = input.nextInt();

        double m = Math.pow(2, line);

        for(int i = 1; i <= m; i*=2){

            for(double k = m; k > i; k/=2){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k *=2){
                System.out.printf("%2d",k);
            }
            for(int k = i; k > 1 ; k /=2){
                int j = k;
                j /=2;
                System.out.printf("%2d",j);
            }
            System.out.println();
        }

    }
}
