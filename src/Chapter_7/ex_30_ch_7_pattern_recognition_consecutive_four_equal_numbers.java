package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 12/2/16.
 */
public class ex_30_ch_7_pattern_recognition_consecutive_four_equal_numbers {
    public static void main(String[] args) {
        int numberOfValues = getNumberOfValues();
        int[] values = getValues(numberOfValues);
        printStatus(values);
    }

    public static int getNumberOfValues(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values : ");
        return input.nextInt();
    }

    public static int[] getValues(int numberOfvalues){
        Scanner input = new Scanner(System.in);
        int[] values = new int[numberOfvalues];

        System.out.print("Enter the Values : ");

        for(int i = 0; i < values.length; i++){
            values[i] = input.nextInt();
        }

        return values;
    }

    public static void printStatus(int[] values){
        System.out.print("The list has ");
        System.out.print((checkValue(values)) ? "consecutive fours" : "no consecutive fours");
    }

    public static boolean checkValue(int[] values){

        for(int i = 0; i < values.length; i++){

            int countSameValue = 0;

            for(int k = 0; k < values.length; k++){
                if( values[i] == values[k]){
                    countSameValue++;
                }
                else
                    countSameValue = 0;

                if(countSameValue == 4){
                    if(k < values.length-1) {
                        countSameValue = checkNext(values, k);
                    }
                }

                if(countSameValue == 4){
                    return true;
                }
            }
        }
        return false;
    }

    public static int checkNext(int[] value, int k){
        int count = 0;
        if(value[k] != value[(k+1)]){
            count = 4;
        }
        return count;
    }
}
