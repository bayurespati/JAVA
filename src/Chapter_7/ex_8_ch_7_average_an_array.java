package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/24/16.
 */
public class ex_8_ch_7_average_an_array {
    public static void main(String[] args) {
        double[] number = getNumber();
        double averageDouble = getAverage(number);
        double averageInt = getAverage(number);

        System.out.println(averageDouble);
    }

    public static double getAverage(double[] array){
        double totalArray = 0;

        for(int i = 0; i < array.length; i++){
            totalArray += array[i];
        }
        return totalArray / array.length;
    }


    public static int getAverage(int[] array){
        int totalArray = 0;

        for(int i = 0; i < array.length; i++){
            totalArray +=array[i];
        }

        return totalArray / array.length;
    }

    public static double[] getNumber(){
        Scanner input = new Scanner(System.in);
        double[] number = new double [10];
        System.out.print("Input ten number : ");

        for(int i = 0; i < number.length; i++){
            number[i] = input.nextDouble();
        }

        return number;
    }
}
