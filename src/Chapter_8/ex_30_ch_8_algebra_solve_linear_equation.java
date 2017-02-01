package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/1/17.
 */
public class ex_30_ch_8_algebra_solve_linear_equation {
    public static void main(String[] args) {
        double[][] matrixA = getMatrix();
        double[] arrayB = getArrayB();

        double[] linearEquation = getResult(matrixA,arrayB);

        System.out.println((linearEquation[0] == 0)
                ? "The equation has no solution."
                : "X = "+linearEquation[0]+", Y = "+linearEquation[1]);
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);

        double[][] matrixA = new double[2][2];

        System.out.print("Input a : ");
        for(int row = 0; row < matrixA.length; row++){
            for(int col = 0; col < matrixA.length; col++){
                matrixA[row][col] = input.nextDouble();
            }
        }

        return matrixA;
    }

    public static double[] getArrayB(){
        Scanner input =  new Scanner(System.in);

        double[] arrayB = new double[2];
        System.out.print("Input b : ");
        for(int i = 0; i < arrayB.length; i++){
            arrayB[i] = input.nextDouble();
        }

        return arrayB;
    }

    public static double[] getResult(double[][] matrixA,double[] arrayB){
        double[] result = new double[2];
        double checkSolution = (matrixA[0][0] * matrixA[1][1]) - (matrixA[0][1] * matrixA[1][0]);

        if(checkSolution == 0){
            return result;
        }else {
            double x = ((arrayB[0] * matrixA[1][1]) - (matrixA[0][1] * arrayB[1])) / ((matrixA[0][0] * matrixA[1][1])-(matrixA[0][1] * matrixA[1][0]));
            double y = ((matrixA[0][0] * arrayB[1]) - (arrayB[0] * matrixA[1][0])) / ((matrixA[0][0] * matrixA[1][1]) - ( matrixA[0][1] * matrixA[1][0]));
            result[0] = x;
            result[1] = y;
        }
        return result;
    }
}
