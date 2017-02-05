package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/2/17.
 */
public class ex_35_ch_8_largest_block {
    public static void main(String[] args) {
        int[][] matrix = getRandomMatrix(10);
        printMatrix(matrix);
        findLargestBlock(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for(int row = 0;row<matrix[0].length;row++) {
            for(int col=0;col<matrix.length;col++) {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static int[][] getRandomMatrix(int n) {

        int[][] randomMatrix = new int[n][n];

        for (int row = 0; row < randomMatrix[0].length; row++) {
            for (int col = 0; col < randomMatrix.length; col++) {
                int rand = (int) (Math.random() * 2);
                randomMatrix[row][col] = rand;
            }
        }

        return randomMatrix;
    }

    public static int[][] getMatrix(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in matrix : ");
        int length = input.nextInt();

        int[][] matrix = new int[length][length];

        System.out.println("Enter the matrix row by row : ");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix.length; col++){
                matrix[row][col] = input.nextInt();
            }
        }
        return matrix;
    }

    public static void findLargestBlock(int[][] matrix){

        int[] index = new int [2];
        int sizeSubMatrix = 0;

        for(int row = 0; row < matrix.length - 1; row++){
            for(int col = 0; col < matrix[0].length - 1; col++){
                if( matrix[row][col] != 0){
                   int tempSize = getSize(matrix,col,row);
                   if(tempSize > sizeSubMatrix){
                       index[0] = row;
                       index[1] = col;
                       sizeSubMatrix = tempSize;
                   }
                }
            }
        }

        System.out.println("The maximum square submatrix is at ("+index[0]+","+index[1]+") with size "+sizeSubMatrix);
    }

    public static int getSize(int[][] matrix,int col,int row) {

        int tempSize = 1;
        int iteration = (row > col) ? row : col;
        while (iteration < matrix.length - 1) {

            if (matrix[row + 1][col + 1] == 1) {
                for (int starCekRow = row + 1, starCekCol = col + 1; (starCekRow > iteration || starCekCol > iteration); starCekRow--, starCekCol--) {
                    if (matrix[row + 1][starCekCol - 1] == 1 && matrix[starCekRow - 1][col + 1] == 1) {
                        tempSize++;
                    }else {
                        return tempSize;
                    }
                }
            }else {
                return tempSize;
            }

            row++;
            col++;
            iteration++;
        }

        return tempSize;
    }

}