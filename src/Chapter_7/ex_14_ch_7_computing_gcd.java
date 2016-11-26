package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/26/16.
 */
public class ex_14_ch_7_computing_gcd {
    public static void main(String[] args) {
        int[] number = getNumber();

        int gcd = getGCD(number);

        printGCD(gcd);
    }

    public static int[] getNumber(){
        Scanner input = new Scanner(System.in);
        int[] number = new int [5];
        System.out.print("Enter five number : ");
        for(int i = 0; i < number.length; i++){
            number[i] = input.nextInt();
        }

        return number;
    }

    public static int getGCD(int... numbers){
        int gcd = 1;
        int minNumber = getMinNumber(numbers);

        while(minNumber > 1){
            if(checkGCD(numbers,minNumber)){
                gcd = minNumber;
                break;
            }
            minNumber--;
        }
        return gcd;
    }

    public static int getMinNumber(int[] numbers){
        int minNumber = numbers[0];

        for(int i = 1; i < numbers.length-1; i++){
            if(minNumber < numbers[i]){
                minNumber = minNumber;
            }
            else
                minNumber = numbers[i];
        }

        return minNumber;
    }

    public static boolean checkGCD(int[] number,int k){

        for(int i = 0; i <number.length; i++){
            if(number[i] % k != 0){
                return false;
            }
        }

        return true;
    }

    public static void printGCD(int gcd){
        System.out.println("gcd is : "+gcd);
    }
}
