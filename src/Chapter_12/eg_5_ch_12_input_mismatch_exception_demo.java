package Chapter_12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by bnamora on 3/2/17.
 */
public class eg_5_ch_12_input_mismatch_exception_demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean continueInput = true;

        do {
            try {
                System.out.print("Enter an integer : ");
                int number = input.nextInt();

                System.out.println("The number entered is : "+number);

                continueInput = false;
            }
            catch (InputMismatchException ex){
                System.out.println("Try again. ("+"Incorrect input : an integer is required)");
                input.nextLine();
            }
        }while (continueInput);
    }
}
