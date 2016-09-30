package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/30/16.
 */
public class ex_16_ch_5_find_the_factor_of_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input integer : ");
        int inputInteger = input.nextInt();

        for(int i = 2; inputInteger > 1;){
            if(inputInteger %i == 0) {
                System.out.print(" "+i);
                inputInteger /= i;
            }
            else
                i++;
        }

    }
}
