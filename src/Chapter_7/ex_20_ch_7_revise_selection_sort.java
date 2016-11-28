package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/28/16.
 */
public class ex_20_ch_7_revise_selection_sort {
    public static void main(String[] args) {
        double[] number = getNumber();
        selectionSort(number);
        print(number);
    }

    public static double[] getNumber(){
        Scanner input = new Scanner(System.in);

        double[] number = new double[10];

        System.out.print("Input ten double number : ");

        for(int i = 0; i < number.length ; i++){
            number[i] = input.nextDouble();
        }

        return number;
    }

    public static void selectionSort(double[] number){
        for (int i = number.length - 1; i >= 0 ; i--) {

            double currentMax = number[i];
            int currentMaxIndex = i;

            for (int j = i - 1; j >= 0; j--) {
                if (currentMax < number[j]) {
                    currentMax = number[j];
                    currentMaxIndex = j;
                }
            }

            if (currentMaxIndex != i){
                number[currentMaxIndex] = number[i];
                number[i] = currentMax;
            }

        }
    }

    public static void print(double[] number){
        System.out.println("sorted Number : ");
        for(int i = 0; i < number.length; i++){
            System.out.print(" "+number[i]);
        }
    }
}

