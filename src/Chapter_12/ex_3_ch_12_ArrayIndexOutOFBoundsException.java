package Chapter_12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by bnamora on 3/7/17.
 */
public class ex_3_ch_12_ArrayIndexOutOFBoundsException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] integer = getInteger();

        while (true) {
            try {
                System.out.print("Enter index Of Array 0 - 99 : ");
                int index = input.nextInt();
                System.out.println("Value array " + index + " is : " + integer[index]);
                break;
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("You index out of bound!");
                input.nextLine();
            } catch (InputMismatchException ex){
                System.out.println("Index must be number!");
                input.nextLine();
            }
        }
    }

    public static int[] getInteger(){
        int[] integer = new int[100];
        for(int i = 0; i < integer.length; i++){
            integer[i] = (int) ( (Math.random() * 100 )+ 1);
        }
        return integer;
    }
}
