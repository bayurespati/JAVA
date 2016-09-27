package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/27/16.
 *
 */
public class eg_2_ch_5_guess_number_one_time {
    public static void main(String[] args) {
        int number = (int)(Math.random()*101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        System.out.printf("\nEnter your guess: ");
        int guess = input.nextInt();


            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.printf("Your guess is too low");
    }
}
