package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/25/17.
 */
public class ex_10_ch_8_game_nine_head_and_tail {
    public static void main(String[] args) {
        int number = getNumber();
        int[] binaryNumber = getBinaryNumber(number);
        int[][] binaryInMatrix = getBinaryInMatrix(binaryNumber);
        printTailAndHead(binaryInMatrix);
    }

    public static int getNumber(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number between 0 and 511 : ");
        return input.nextInt();
    }

    public static int[] getBinaryNumber(int number){
        int[] binaryNumber = new int[9];
        for(int i = 8, tempNumber = number; i >= 0; i--, tempNumber/=2){
            binaryNumber[i] = tempNumber % 2;
        }
        return binaryNumber;
    }

    public static int[][] getBinaryInMatrix(int[] binaryNumber){
        int[][] binaryInMatrix = new int[3][3];
        int indexForBinaryNumber = 0;
        for(int row = 0; row < binaryInMatrix.length; row++){
            for(int col = 0; col < binaryInMatrix.length; col++){
                binaryInMatrix[row][col] = binaryNumber[indexForBinaryNumber];
                indexForBinaryNumber++;
            }
        }
        return binaryInMatrix;
    }

    public static void printTailAndHead(int[][] binaryNumber){
        for(int i = 0; i < binaryNumber.length; i++){
            for(int k = 0; k < binaryNumber.length; k++){
                System.out.print((binaryNumber[i][k] == 0)?"H ":"T ");
            }
            System.out.println();
        }
    }
}
