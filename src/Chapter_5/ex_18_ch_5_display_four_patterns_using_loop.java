package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/30/16.
 */
public class ex_18_ch_5_display_four_patterns_using_loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("BIR : ");
        int bir = input.nextInt();

        for(int i = 1; i <= bir; i++){


            for(int k = 1; k <= i; k++ ){
                System.out.print(k);
            }
            for(int j = i; j < bir; j++){
                System.out.print(" ");
            }


            for(int k = bir, j=1; k >= i; k--,j++){
                System.out.print(j);
            }
            for(int k = 1; k < i; k++){
                System.out.print(" ");
            }


            for(int k =bir; k > i; k--){
                System.out.print(" ");
            }
            for(int k = i; k>=1; k--){
                System.out.print(k);
            }


            for(int k = 1; k <= i; k++){
                System.out.print(" ");
            }
            for(int k = i, m=1; k <= bir; k++,m++){
                System.out.print(m);
            }
            System.out.println();
        }
    }
}
