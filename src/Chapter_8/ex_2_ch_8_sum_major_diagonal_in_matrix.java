package Chapter_8;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

/**
 * Created by bnamora on 1/23/17.
 */
public class ex_2_ch_8_sum_major_diagonal_in_matrix {
    public static void main(String[] args) {
        double[][] number = getNumber();
        double totalDiagonal =  sumMajorDiagonal(number);
        System.out.println("Sum of the elements in the major diagonal is :"+ totalDiagonal);
    }

    public static double[][] getNumber(){
        Scanner input = new Scanner(System.in);
        double[][] number = new double[4][4];

        System.out.println("Enter a 4-by-4 matrix row by row");
        for(int row = 0; row < number.length; row++){
            for(int col = 0; col < number.length; col++){
                number[row][col] = input.nextDouble();
            }
        }

        return number;
    }

    public static double sumMajorDiagonal(double[][] number){
        double totalDiagonal = 0;
        for(int i = 0; i < number.length; i++){
            totalDiagonal += number[i][i];
        }
        return totalDiagonal;
    }
}
