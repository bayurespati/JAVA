package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/1/17.
 */
public class ex_25_ch_8_matrix_markov {
    public static void main(String[] args) {
        double[][] matrix = getMatrix();

        System.out.println(isMarkovMatrix(matrix) ?"Is markov matrix" : "Is not markov matrix");
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a 3-by-3 matrix row by row : ");

        double[][] matrix = new double[3][3];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                matrix[row][col] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static boolean isMarkovMatrix(double[][] matrix){

        for(int col = 0; col < matrix[0].length; col++){
            double sumMatrix = 0;

            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][col] < 0){
                    return false;
                }
                sumMatrix += matrix[row][col];
            }
            if(sumMatrix != 1){
                return false;
            }
        }
        return true;
    }
}
