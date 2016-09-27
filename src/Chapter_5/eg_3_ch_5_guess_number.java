package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/27/16.
 */
public class eg_3_ch_5_guess_number {
        public static void main(String[] args) {
            int number = (int)(Math.random()*101);

            Scanner input = new Scanner(System.in);
            System.out.println("Guess a magic number between 0 and 100");

            int guess = -1;
            while (guess != number){
                System.out.printf("\nEnter your guess :");
                guess = input.nextInt();

                if(guess == number)
                    System.out.println("Yes, the number is "+number);
                else if(guess > number)
                    System.out.println("Your guess is too high");
                else
                    System.out.println("Your guess is too low");
            }
        }

}
