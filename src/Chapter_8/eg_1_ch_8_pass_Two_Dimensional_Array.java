package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/23/17.
 */
public class eg_1_ch_8_pass_Two_Dimensional_Array {
    public static void main(String[] args) {
        int[][] m = getArray(); // get an array

        //Display sum of elements
        System.out.println("\nSum of all element is "+ sum(m));
    }

    public static int[][] getArray(){
        //Create a Scanner
        Scanner input = new Scanner(System.in);

        //Enter array Values
        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and " +m[0].length+" columns: ");

        for(int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = input.nextInt();
            }
        }

        return m;
    }

    public static int sum(int[][] m){
        int total = 0;

        for(int row = 0; row < m.length; row++){
            for(int columns = 0; columns < m[row].length; columns++){
                total += m[row][columns];
            }
        }

        return total;
    }
}
