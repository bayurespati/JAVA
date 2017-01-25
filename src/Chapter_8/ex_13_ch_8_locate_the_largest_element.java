package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/25/17.
 */
public class ex_13_ch_8_locate_the_largest_element {
    public static void main(String[] args) {
        double[][] matrix = getMatrix(getRowAndCol());
        print(getLocationLargestElement(matrix));
    }

    public static int[] getRowAndCol(){
        Scanner input = new Scanner(System.in);

        int[] rowAndCol = new int [2];
        System.out.print("Enter the number of rows and columns of the array : ");
        for(int i = 0; i < 2; i++){
            rowAndCol[i] = input.nextInt();
        }
        return rowAndCol;
    }

    public static double[][] getMatrix(int[] rowAndCol){
        Scanner input = new Scanner(System.in);
        double[][] matrix = new double [rowAndCol[0]][rowAndCol[1]];

        System.out.println("Enter The array");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = input.nextDouble();
            }
        }

        return matrix;
    }

    public static int[] getLocationLargestElement(double[][] matrix){
        int[] locationLargestElement = new int [2];

        double tempLargestElement = 0;
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] > tempLargestElement){
                    tempLargestElement = matrix[row][col];
                    locationLargestElement[0]=row;
                    locationLargestElement[1]=col;
                }
            }
        }

        return locationLargestElement;
    }

    public static void print(int[] locationLargestElement){
        System.out.print("The location of the largest element is at : ");
        for(int i = 0; i < locationLargestElement.length; i++){
            System.out.print(locationLargestElement[i]+" ");
        }
    }
}
