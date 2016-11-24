package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/23/16.
 */
public class ex_3_ch_7_count_occurrence_of_number {
    public static void main(String[] args) {

        int[] number = getArray();
        int[] countNumber = countNumber(number);


        printNumber(countNumber);
    }

    public static void printNumber(int[] countNumber){

        for(int i = 1; i < countNumber.length; i++){
            if(countNumber[i] != 0 ){
                System.out.println(i+" occurs "+countNumber[i]+" times ");
            }
        }

    }

    public static int[] countNumber(int[] number){
        int[] counts = new int[100];

        for(int i = 0; i <counts.length; i++ ){
            counts [number[i]] ++;
        }
        return counts;
    }

    public static int[] getArray(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");

        int[] number = new int [100];

        for (int i = 0; i < number.length; i++) {
            int num = input.nextInt();
            if (num == 0) {
                break;
            }
            number[i] = num;
        }

        return number;

    }
}
