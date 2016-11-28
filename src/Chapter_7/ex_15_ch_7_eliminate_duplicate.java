package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/26/16.
 */
public class ex_15_ch_7_eliminate_duplicate {
    public static void main(String[] args) {
        int[] number = getNumber();
        int[] distinctNumber = eliminateDuplicates(number);

        printNumber(distinctNumber);

    }

    public static int[] getNumber(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input ten Integer :  ");

        int[] number = new int [10];

        for(int i = 0; i < number.length; i++){
            number[i] = input.nextInt();
        }

        return number;
    }

    public static int[] eliminateDuplicates(int[] list){
        int[] distinctNumber = new int [list.length];

        int indexOfDN = 0;

        for(int i = 0; i < list.length; i++){
            if(existNumber(list[i],distinctNumber)){
                distinctNumber[indexOfDN] = list[i];
                indexOfDN++;
            }
        }

        return distinctNumber;
    }

    public static boolean existNumber (int list, int[] number){

        for(int i = 0; i < number.length; i++){
            if(number[i] == list){
                return false;
            }
        }

        return true;
    }

    public static void printNumber(int[] number){
        System.out.print("The Distinct Number is : ");
        for(int i = 0; i < number.length; i++){
            if(number[i] == 0){
                break;
            }
            System.out.print(" "+number[i]);
        }
    }
}
