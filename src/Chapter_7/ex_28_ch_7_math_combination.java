package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 12/2/16.
 */
public class ex_28_ch_7_math_combination {
    public static void main(String[] args) {
        int[] number = getNumber();
        printCombination(number);
    }

    public static int[] getNumber(){
        Scanner input = new Scanner(System.in);

        int[] number = new int[10];
        System.out.print("Input ten number : ");
        for(int i = 0; i<number.length; i++){
            number[i] = input.nextInt();
        }
        return number;
    }

    public static void printCombination(int[] number){

        System.out.println("Combination of "+number.length+" number");
        int count = 0;
        for(int i = 0; i < number.length; i++){

            for(int k = (i+1); k < number.length; k++){
                if(number[i] != number[k]){
                    System.out.print(number[i]+"."+number[k]+" ");
                    count++;
                }

                if(count % 10 == 0){
                    System.out.println();
                }
            }

        }
    }

}

