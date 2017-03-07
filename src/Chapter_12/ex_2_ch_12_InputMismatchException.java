package Chapter_12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by bnamora on 3/7/17.
 */
public class ex_2_ch_12_InputMismatchException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean statusInput = true;
        do {
            try {
                System.out.print("Input Two integer : ");
                int integer1 = input.nextInt();
                int integer2 = input.nextInt();

                System.out.println("Sum is " + (integer1 + integer2));

                statusInput = false;

            } catch (InputMismatchException ex) {
                System.out.println("Wrong input ");
                input.nextLine();
            }
        }while (statusInput);
    }
}
