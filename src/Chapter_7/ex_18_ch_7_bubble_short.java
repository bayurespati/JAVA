package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/28/16.
 */
public class ex_18_ch_7_bubble_short {
    public static void main(String[] args) {
        int[] number = getNumber();

        sortingNumber(number);

        print(number);
    }

    public static int[] getNumber(){
        Scanner input = new Scanner(System.in);
        int[] number = new int[6];
        System.out.print("Enter ten Number : ");
        for(int i = 0; i <number.length; i++){
            number[i] = input.nextInt();
        }
        return number;
    }

    public static void sortingNumber(int[] number){

       int maxIterasi = number.length - 1;

       for(int i = 0; i < number.length; i++) {

            int index = 0;

            while (index < maxIterasi) {
                int maxNumber = number[index];

                if (maxNumber > number[index + 1]) {
                    number[index] = number[index+1];
                    number[index+1] = maxNumber;
                }

                index ++;
            }

            maxIterasi--;
        }

    }

    public static void print(int[] number){
        for(int i = 0; i < number.length; i++){
            System.out.print(" "+number[i]);
        }
    }
}
