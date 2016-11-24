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

        print(distinctNumber,totalDistinctNumber);

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

    public static int[] getDistinctNumber(int[] number){
        int[] distinctNumber = new int [number.length];
        int distinctIN = 0;
        for(int i = 0; i < number.length; i++){
            if(!isNumberExist(distinctNumber,number[i])){
                distinctNumber[distinctIN] = number[i];
                distinctIN++;
            }
        }
        return distinctNumber;
    }

    public static boolean isNumberExist(int[] arrayOfNum, int num) {

        for(int i = 0; i < arrayOfNum.length; i++){
            if(arrayOfNum[i] == num){
                return true;
            }
        }
        return false;
    }

    public static int getTotalDN(int[] distinctNumber){
        int total = 0;

        for(int i = 0; i < distinctNumber.length; i++){
            if(distinctNumber[i] == 0){
                break;
            }
            total++;
        }

        return total;
    }

    public static void print(int[] number, int total){

        System.out.println("The number of distinct is : "+total);
        System.out.print("The distinct number are : ");

        for(int i = 0; i < number.length; i++){
            if(number[i] == 0){
                break;
            }
            System.out.print(" "+number[i]);
        }
    }
}
