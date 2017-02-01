package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/1/17.
 */
public class ex_29_ch_8_identical_array {
    public static void main(String[] args) {
        int[][] matrix1 = getMatrix(1);
        int[][] matrix2 = getMatrix(2);

        System.out.println(isIdentical(matrix1,matrix2)
                ?"The two arrays are identical"
                :"The two arrays are not identical");
    }

    public static int[][] getMatrix(int list){
        Scanner input = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        System.out.print("Input List"+list+" :");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = input.nextInt();
            }
        }

        return matrix;
    }

    public static boolean isIdentical (int[][] matrix1, int[][] matrix2){

        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix1[0].length; col++){

                if(!checkMatrix1OnMatrix2(matrix1,matrix2,row,col)){
                   return false;
                }

            }
        }
        return true;
    }

    public static boolean checkMatrix1OnMatrix2(int[][] matrix1,int[][] matrix2,int rowm1,int colm1){
        for(int rowM2 = 0; rowM2 < matrix2.length; rowM2++){
            for(int colM2 = 0; colM2 < matrix2.length; colM2++){
                if(matrix1[rowm1][colm1] == matrix2[rowM2][colM2]){
                    return true;
                }
            }
        }
        return false;
    }
}
