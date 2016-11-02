package Chapter_6;

import java.util.Scanner;

/**
 * Created by DWP on 11/2/16.
 */
public class ex_37_ch_6_format_an_integer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        System.out.print("Enter width : ");
        int width = input.nextInt();

        printFormatInteger(number,width);
    }

    public static void printFormatInteger(int number, int width){
        System.out.println("the format is : "+formatInteger(number,width));
    }

    public static String formatInteger(int number, int width){
        String integer = "";

        while(number > 0 || width > 0){

            integer = (number % 10) + integer;
            number /=10;
            width--;
        }
        return integer;
    }
}
