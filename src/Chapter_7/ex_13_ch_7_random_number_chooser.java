package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/25/16.
 */
public class ex_13_ch_7_random_number_chooser {
    public static void main(String[] args) {
        int[] exceptNumber = getExceptNumber();

        print(getRandom(exceptNumber));
    }


    public static int[] getExceptNumber(){
        Scanner input = new Scanner(System.in);

        int[] exceptNumber = new int[55];
        System.out.print("Input except Number : ");
        for(int i = 1; i < exceptNumber.length; i++){
            int number = input.nextInt();

            if(number > 10 || number <= 0){
                break;
            }
            exceptNumber[i]= number;
        }

        return exceptNumber;
    }


    public static int getRandom(int... numberExcept){
        int[] number = getNumber();


        int randomIndex = randomNumber();

        while(!checkNumber(numberExcept,randomIndex)){

            randomIndex = randomNumber();
        }

        return number[randomIndex];

    }


    public static int[] getNumber(){
        int[] numberOfArray = new int [55];

        for(int i = 1; i < numberOfArray.length; i++){
            numberOfArray[i] = i;
        }
        return numberOfArray;
    }

    public static int randomNumber(){
        return  (int) (Math.random()*55)+1;
    }

    public static boolean checkNumber(int[] numberExcept, int randomIndex){
        for(int i = 1; i < numberExcept.length; i++){
            if(numberExcept[i] == randomIndex){
                return false;
            }
        }
        return true;
    }

    public static void print(int number){
        System.out.println(number);
    }
}
