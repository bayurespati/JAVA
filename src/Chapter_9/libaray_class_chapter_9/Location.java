package Chapter_9.libaray_class_chapter_9;

import java.util.Scanner;

/**
 * Created by bnamora on 2/10/17.
 */
public class Location {
    private int row;
    private int col;
    private double maxValue;

    public Location(){
        row = 0;
        col = 0;
        maxValue = 0;
    }

    public Location(double[][] matrix){
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }

    public double getMaxValue(){
        return maxValue;
    }

    public void setRow(int row){
        this.row = row;
    }

    public void setCol(int col){
        this.col = col;
    }

    public void setMaxValue(double maxValue){
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] matrix){
        Location location = new Location();
        double tempMaxValue = matrix[0][0];

        for(int  row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                if(matrix[row][col] > tempMaxValue){
                    location.setRow(row);
                    location.setCol(col);
                    location.setMaxValue(matrix[row][col]);

                    tempMaxValue = matrix[row][col];
                }
            }
        }
        return location;
    }

    public static double[][] getMatrix(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row and col in the array : ");
        int lengthRow = input.nextInt();
        int lengthCol = input.nextInt();

        double[][] matrix = new double[lengthRow][lengthCol];
        System.out.println("Enter array : ");
        for(int row = 0; row < matrix.length; row++){
            for(int col = 0; col < matrix[0].length; col++){
                matrix[row][col] = input.nextDouble();
            }
        }
        return matrix;
    }
}
