package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/23/17.
 */
public class ex_5_ch_8_algebra_add_two_matrices {
    public static void main(String[] args) {
        double[][] firstMatrix = getNumber(1);
        double[][] secondMatrix = getNumber(2);

        double[][]  sumMatrix = addMatrix(firstMatrix,secondMatrix);
        printMatrix(sumMatrix);
    }
    public static double[][] getNumber(int number){
        Scanner input = new Scanner(System.in);

        double[][] matrix = new double[3][3];
        System.out.print("Enter Matrix"+number+" :");

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                matrix[row][col] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static double[][] addMatrix(double[][] firstMatrix, double[][] secondMatrix){
        double[][] sumMatrix = new double[3][3];

        for(int col = 0; col < sumMatrix.length; col++){
            for(int row = 0; row < sumMatrix.length; row++){
                sumMatrix[col][row] = firstMatrix[col][row] + secondMatrix[col][row];
            }
        }

        return sumMatrix;
    }

    public static void printMatrix(double[][] matrix){
        System.out.println("The matrix are added as follow ");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                System.out.print(" "+matrix[row][col]);
            }
            System.out.println();
        }
    }
}
