package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/31/17.
 */
public class ex_23_ch_8_game_find_the_flipped_cell {
    public static void main(String[] args) {
        int[][] matrix = {
                {1,0,1,0,1,1},
                {1,1,1,1,0,0},
                {0,1,0,1,1,1},
                {1,1,1,1,1,1},
                {0,1,1,1,1,0},
                {1,0,0,0,0,1}
        };

        int[][] matrixUser = getMatrix();
        findFlippedCell(matrix,matrixUser);
    }

    public static int[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 6-by-6 matrix row by row : ");
        int[][] matrix = new int[6][6];
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void findFlippedCell(int[][] matrix, int[][] matrixUser){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] != matrixUser[row][col]){
                    System.out.println("The Flipped cell is at ("+row+", "+col+")");
                    return;
                }
            }
        }
    }

    /*
    1 1 1 0 1 1
    1 1 1 1 0 0
    0 1 0 1 1 1
    1 1 1 1 1 1
    0 1 1 1 1 0
    1 0 0 0 0 1
    */
}
