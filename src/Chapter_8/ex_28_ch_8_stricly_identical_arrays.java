package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/1/17.
 */
public class ex_28_ch_8_stricly_identical_arrays {
    public static void main(String[] args) {
        int[][] matrix1 = getMatrix(1);
        int[][] matrix2 = getMatrix(2);

        System.out.println(isStrictlyIdentical(matrix1,matrix2)
                ?"The two arrays are strictly identical"
                :"The two arrays are not strictly identical");
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

    public static boolean isStrictlyIdentical(int[][] matrix1, int[][] matrix2){
        for(int row = 0; row < matrix1.length; row++){
            for(int col = 0; col < matrix1[0].length; col++){
                if(matrix1[row][col] != matrix2[row][col]){
                    return false;
                }
            }
        }
        return true;
    }


}
