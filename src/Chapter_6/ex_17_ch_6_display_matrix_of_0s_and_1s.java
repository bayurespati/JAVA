package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 10/27/16.
 */
public class ex_17_ch_6_display_matrix_of_0s_and_1s {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n : ");
        printMatrixN(input.nextInt());
    }

    public static void printMatrixN(int n){
        for(int i = n; i > 0; i --){
            for(int k = n; k > 0; k--) {
                int m = (int) (Math.random() * 2);
                System.out.print(m);
            }
            System.out.println();
        }

    }
}
