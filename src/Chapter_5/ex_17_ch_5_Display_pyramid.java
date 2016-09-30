package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/30/16.
 */
public class ex_17_ch_5_Display_pyramid {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        System.out.print("Enter the number of lines : ");
        int line = input.nextInt();

        /*for(int i =1; i <= line; i++){

            for(int j = line; j > i; j--){
                System.out.print(" ");
            }
            System.out.println(i);
        }*/

        /*for(int i = 1; i<= line; i++){

            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i =1; i <= line; i++){
            int j;

            for(j = line; j > i; j--){
                System.out.print(" ");
            }
            for(int k=1; k<=i;k++){
                System.out.print(j);
                j--;
            }
            System.out.println();
        }*/

        for(int i =1; i <= line; i++){
            for(int k = line; k > i; k--){
                    System.out.print("   ");
            }
            for(int k = i; k >= 1; k--){
                System.out.printf("%2d ",k);
            }
            for(int k = 2; k <= i; k++){
                System.out.printf("%2d ",k);
            }
            System.out.println();
        }

    }
}
