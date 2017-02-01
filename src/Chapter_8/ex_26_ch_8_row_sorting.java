package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/1/17.
 */
public class ex_26_ch_8_row_sorting {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        sortedRow(matrix);
        printSorted(matrix);
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double[3][3];
        System.out.println("Enter a 3-by-3 matrix row by row");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                matrix[row][col] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static void sortedRow(double[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                double minimumNumber = matrix[row][col];
                changeMinimumNumber(matrix,row,col,minimumNumber);
            }
        }
    }

    public static void changeMinimumNumber(double[][] matrix, int row, int col, double minimumNumber){
        for(int index = col + 1; index < matrix[0].length; index++){
            if(matrix[row][index] < minimumNumber){
                matrix[row][col] = matrix[row][index];
                matrix[row][index] = minimumNumber;
                minimumNumber = matrix[row][col];
            }
        }
    }

    public static void printSorted(double[][] matrix){
        System.out.println("The row sorted array is : ");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
