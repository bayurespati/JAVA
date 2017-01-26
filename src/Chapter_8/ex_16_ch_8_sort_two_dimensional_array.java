package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/25/17.
 */
public class ex_16_ch_8_sort_two_dimensional_array {
    public static void main(String[] args) {
        int[][] number = getNumber();

        sortArrayForRow0(number);
//        sortArrayForRow1(number);

        print(number);
    }

    public static int[][] getNumber(){
        Scanner input = new Scanner(System.in);
        int[][] number = new int[6][2];

        System.out.print("Input 6 row and 2 col number : ");
        for(int row = 0; row < number.length; row++){
            for(int col = 0; col < number[0].length; col++){
                number[row][col] = input.nextInt();
            }
        }

        return number;
    }

    public static void sortArrayForRow0(int[][] number){
        for (int i = 0; i <number.length ; i++) {

            int currentMin0 = number[i][0];
            int currentMin1 = number[i][1];
            int currentMinIndex = i;

            for (int j = i + 1; j < number.length; j++) {
                if (currentMin0 > number[j][0]) {
                    currentMin0 = number[j][0];
                    currentMin1 = number[j][1];
                    currentMinIndex = j;
                }
                else if (currentMin0 == number[j][0] && currentMin1 > number[j][1]) {
                        currentMin0 = number[j][0];
                        currentMin1 = number[j][1];
                        currentMinIndex = j;
                }

            }
            if (currentMinIndex != i){
                number[currentMinIndex][0] = number[i][0];
                number[i][0] = currentMin0;

                number[currentMinIndex][1] = number[i][1];
                number[i][1] = currentMin1;
            }
        }
    }
//
//    public static void sortArrayForRow1(int[][] number){
//
//        for (int i = 0; i <number.length ; i++) {
//
//            int currentMin0 = number[i][0];
//            int currentMin1 = number[i][1];
//            int currentMinIndex = i;
//
//            for (int j = i + 1; j < number.length; j++) {
//                if (currentMin0 == number[j][0] && currentMin1 > number[j][1]) {
//                    currentMin0 = number[j][0];
//                    currentMin1 = number[j][1];
//                    currentMinIndex = j;
//                }
//            }
//            if (currentMinIndex != i){
//                number[currentMinIndex][0] = number[i][0];
//                number[i][0] = currentMin0;
//
//                number[currentMinIndex][1] = number[i][1];
//                number[i][1] = currentMin1;
//            }
//        }
//
//    }

    public static void print(int[][] number){
        System.out.println("The sort Input is : ");

        for(int row = 0; row < number.length; row ++){
            for(int col = 0; col < number[0].length; col++){
                System.out.print(number[row][col]+" ");
            }
            System.out.println();
        }
    }
}
