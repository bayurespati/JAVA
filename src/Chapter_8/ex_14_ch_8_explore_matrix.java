package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/25/17.
 */
public class ex_14_ch_8_explore_matrix {
    public static void main(String[] args) {
        int sizeForMatrix = getSizeForMatrix();
        int[][] matrix = getMatrix(sizeForMatrix);
        printSameNumber(matrix,sizeForMatrix);
    }

    public static int getSizeForMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the matrix : ");
        return input.nextInt();
    }

    public static int[][] getMatrix(int sizeForMatrix){
        int[][] matrix = new int[sizeForMatrix][sizeForMatrix];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                matrix[row][col] = (int) (Math.random()*2);
            }
        }
        return matrix;
    }

    public static void printSameNumber(int[][] matrix,int sizeForMatrix){

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }

        printSameNumberInRow(matrix,sizeForMatrix);
        printSameNumberInCol(matrix,sizeForMatrix);
        printSameNumberMajorDiagonal(matrix,sizeForMatrix);
        printSameNumberSubDiagonal(matrix,sizeForMatrix);
    }

    public static void printSameNumberInRow(int[][] matrix,int sizeForMatrix){
        boolean sameNumber = true;
        for(int row = 0; row < matrix.length; row++){
            int countFor0 = 0, countFor1 = 0;
            for(int col = 0; col < matrix.length; col++){
                if(matrix[row][col] == 0){
                    countFor0++;
                }else {
                    countFor1++;
                }

                if(countFor0 == sizeForMatrix){
                    System.out.println("All 0s on row "+ row);
                    sameNumber = false;
                }else if(countFor1 == sizeForMatrix){
                    System.out.println("All 1s on row "+ row);
                    sameNumber = false;
                }
            }
        }
        if(sameNumber){
            System.out.println("No same numbers on row");
        }
    }

    public static void printSameNumberInCol(int[][] matrix,int sizeForMatrix){
        boolean sameNumber = true;
        for(int col = 0; col < matrix.length; col++){
            int countFor0 = 0, countFor1 = 0;
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][col] == 0){
                    countFor0++;
                }else {
                    countFor1++;
                }

                if (countFor0 == sizeForMatrix) {
                    System.out.println("All 0s on Col " + col);
                    sameNumber = false;
                } else if (countFor1 == sizeForMatrix) {
                    System.out.println("All 1s on Col " + col);
                    sameNumber = false;
                }
            }
        }

        if(sameNumber){
            System.out.println("No same numbers on col");
        }
    }

    public static void printSameNumberMajorDiagonal(int[][] matrix, int sizeForMatrix){
        int countForSameMajorDiagonal0 = 0, countForSameMajorDiagonal1 = 0;
        for(int row = 0 ; row < matrix.length; row++){
            if(matrix[row][row] == 0){
                countForSameMajorDiagonal0++;
            }else {
                countForSameMajorDiagonal1++;
            }
        }

        boolean haveSameNumber = (countForSameMajorDiagonal0 == sizeForMatrix || countForSameMajorDiagonal1 == sizeForMatrix);
        System.out.println((haveSameNumber)
                ?"Have Same Number On Major Diagonal"
                :"No same Number on the major diagonal");
    }

    public static void printSameNumberSubDiagonal(int[][] matrix, int sizeForMatrix){
        int countForSameSubDiagonal0 = 0, countForSameSubDiagonal1 = 0;
        for(int row = 0,col =  sizeForMatrix-1; row < matrix.length; row++, col--){
            if(matrix[row][col] == 0){
                countForSameSubDiagonal0++;
            }else {
                countForSameSubDiagonal1++;
            }
        }

        boolean haveSameNumber = (countForSameSubDiagonal0 == sizeForMatrix || countForSameSubDiagonal1 == sizeForMatrix);
        System.out.println((haveSameNumber)
                ?"Have Same Number On Sub Diagonal"
                :"No same Number on the Sub diagonal");
    }
}
