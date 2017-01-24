package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/24/17.
 */
public class ex_6_ch_8_algebra_multiply_two_matrix {
    public static void main(String[] args) {
        double[][] firstMatrix = getNumber(1);
        double[][] secondMatrix = getNumber(2);

        double[][] sumMatrix = multipleMatrix(firstMatrix,secondMatrix);

        printSumMatrix(sumMatrix);

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

    public static double[][] multipleMatrix(double[][] firstMatrix,double[][] secondMatrix){
        double[][] sumMatrix = new double[firstMatrix.length][firstMatrix.length];

        for(int row = 0; row < sumMatrix.length; row++){

            for(int col = 0; col < sumMatrix.length; col++){

                for(int changePoint = 0; changePoint < secondMatrix.length; changePoint++){
                    sumMatrix [row][col] += firstMatrix[row][changePoint] * secondMatrix[changePoint][col];
                }
            }
        }

        return sumMatrix;
    }

    public static void printSumMatrix(double[][] matrix){
        System.out.println("The matrix are multiple as follow ");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                System.out.printf(" %.2f",matrix[row][col]);
            }
            System.out.println();
        }
    }
}
