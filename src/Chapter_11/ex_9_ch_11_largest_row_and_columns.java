package Chapter_11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_9_ch_11_largest_row_and_columns {
    public static void main(String[] args) {
        int[][] matrix = getMatrix();
        printMatrix(matrix);

        ArrayList<Integer> largestRow = getLargestRow(matrix);
        ArrayList<Integer> largestCol = getLargestCol(matrix);

        System.out.print("the largest row index ");
        for (Integer list: largestRow)
            System.out.print(list+" ");
        System.out.print("\nthe largest col index ");
        for (Integer list: largestCol)
            System.out.print(list+" ");
}

    public static int[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n : ");
        int n = input.nextInt();

        int[][] matrix = new int[n][n];

        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static ArrayList<Integer> getLargestRow(int[][] matrix){
        ArrayList<Integer> largestRow = new ArrayList<>();
        int tempLargest = 1;
        for(int row = 0; row < matrix.length; row++){
            int count = 0;
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] == 1){
                    count++;
                }
            }
            if(count > tempLargest){
                tempLargest = count;
                largestRow.clear();
                largestRow.add(row);
            }else if(count == tempLargest){
                largestRow.add(row);
            }
        }


        return largestRow;
    }

    public static ArrayList<Integer> getLargestCol(int[][] matrix){
        ArrayList<Integer> largestRow = new ArrayList<>();
        int tempLargest = 1;
        for(int col = 0; col < matrix[0].length; col++){
            int count = 0;
            for(int row = 0; row < matrix.length; row++){
                if(matrix[row][col] == 1){
                    count++;
                }
            }
            if(count > tempLargest){
                tempLargest = count;
                largestRow.clear();
                largestRow.add(col);
            }else if(count == tempLargest){
                largestRow.add(col);
            }
        }


        return largestRow;
    }

    public static void printMatrix(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
}
