package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/23/17.
 */
public class ex_1_ch_8_sum_elements_column_by_column {
    public static void main(String[] args) {
        double[][] number = getNumber();

        for(int col = 0; col < number[0].length; col++){
            double total = sumColumn(number,col);
            System.out.println("Sum of the elements at columns " +col+" is "+total);
        }
    }

    public static double[][] getNumber(){
        Scanner input = new Scanner(System.in);
        double[][] number = new double[3][4];

        System.out.println("Enter a 3-by-4 matrix row by row : ");
        for(int row = 0; row < number.length; row++){
            for(int col = 0; col <number[row].length; col++){
                number[row][col] = input.nextDouble();
            }
        }
        return number;
    }

    public static double sumColumn(double[][] number, int columnIndex){
        double total = 0;

        for(int row = 0; row < number.length; row++){
            total += number[row][columnIndex];
        }

        return total;
    }
}
