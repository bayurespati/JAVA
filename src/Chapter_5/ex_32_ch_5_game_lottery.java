package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/10/16.
 */
public class ex_32_ch_5_game_lottery {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digit): ");
        int guess = input.nextInt();

        int lottery1 = (int) (Math.random() * 10);
        int lottery2 = (int) (Math.random() * 10);

        while(lottery1 == lottery2){
            lottery2 = (int) (Math.random() * 10);
        }

        int lotteryDigit1 = lottery1 % 10;
        int lotteryDigit2 = lottery2 % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;



        System.out.println("The lottery number is "+ lottery1+lottery2);

        if(guessDigit1 == lottery1 && guessDigit2 == lotteryDigit2)
            System.out.println("Exact match: you win $10.000");
        else if((guessDigit2 == lotteryDigit1) && (guessDigit1 == lotteryDigit1))
            System.out.println("Match all digits : you win $3.000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit : you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
