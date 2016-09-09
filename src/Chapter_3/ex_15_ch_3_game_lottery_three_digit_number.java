package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/9/16.

 */
public class ex_15_ch_3_game_lottery_three_digit_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int lottery = (int) (Math.random() * 900) +100;

        System.out.print("Enter your lottery pick (three digit): ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery % 10;
        int lotteryDigit2 = (lottery % 100) - lotteryDigit1;
        int lotteryDigit3 = (lottery % 1000) /100;

        int guessDigit1 = guess % 10;
        int guessDigit2 = (guess % 100) - guessDigit1;
        int guessDigit3 = (guessDigit2 % 1000) / 100;

        System.out.println("The lottery number is "+ lottery);

        boolean award1= (lottery == guess);
        boolean award2= (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 ) &&
                        (guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ) &&
                        (guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3);
        boolean award3= (guessDigit1 == lotteryDigit1)|| (guessDigit2 == lotteryDigit2) || (guessDigit3 == lotteryDigit3);

        if(award1)
            System.out.println("You got  : $10000");
        else if(award2)
            System.out.println("You got : $3000");
        else if(award3)
            System.out.println("You got: $1000");
        else
            System.out.println("You got fuck");

    }
}
