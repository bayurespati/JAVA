package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/1/17.
 */
public class ex_27_ch_8_column_sorting {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();
        sortedColumn(matrix);
        print(matrix);
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);

        System.out.println("Input a 3-by-3 matrix row by row : ");
        double[][] matrix = new double[3][3];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = input.nextDouble();
            }
        }
        return matrix;
    }

    public static void sortedColumn(double[][] matrix){
        for(int col = 0; col < matrix[0].length; col++){
            for(int row = 0; row < matrix.length; row++){
                double minimumNumber = matrix[row][col];
                changeMinimumNumber(matrix,row,col,minimumNumber);
            }
        }
    }

    public static void changeMinimumNumber(double[][] matrix, int row, int col,double minimumNumber){
        for(int index = row + 1; index < matrix.length; index++){
            if(matrix[index][col] < minimumNumber){
                matrix[row][col] = matrix[index][col];
                matrix[index][col] = minimumNumber;
                minimumNumber = matrix[row][col];
            }
        }
    }

    public static void print(double[][] matrix){
        System.out.println("The column sorted array is : ");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
