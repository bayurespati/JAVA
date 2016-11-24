package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/24/16.
 */
public class ex_5_ch_7_print_distinct_number {
    public static void main(String[] args) {
        int[] number = getNumber();

        int[] distinctNumber = getDistinctNumber(number);

        int totalDistinctNumber = getTotalDN(distinctNumber);

        printTest(distinctNumber,totalDistinctNumber);

    }

    public static void printTest(int[] number, int total){

        System.out.println("The number of distinct is : "+total);
        System.out.print("The distinct number are : ");

        for(int i = 0; i < number.length; i++){
            if(number[i] != 0){
                System.out.print(" "+number[i]);
            }
        }
    }

    public static int getTotalDN(int[] distinctNumber){
        int total = 0;

        for(int i = 0; i < distinctNumber.length; i++){
            if(distinctNumber[i] != 0){
                total++;
            }
        }

        return total;
    }

    public static int[] getDistinctNumber(int[] number){
        int[] distinctNumber = new int [10];

        int temp = 0;

        for(int i = 0; i < number.length; i++ ){


            for(int k = 0; k <= i; k++){
                if(distinctNumber[k] == number[i]){
                    temp = 0;
                    break;
                }
                else
                    temp = number[i];
            }

            distinctNumber[i] = temp;
        }
        return distinctNumber;
    }

    public static int[] getNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten number : ");

        int[] number = new int [10];

        for(int i = 0; i < number.length; i++){
            number[i] = input.nextInt();
        }

        return number;
    }
}
