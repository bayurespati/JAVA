package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/9/16.
 *
 */
public class ex_10_ch_3_game_addition_quiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random()*100)+1;
        int number2 = (int) (Math.random()*100)+1;

        if (number1<number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.print("what is : "+number1+" - "+number2+" ? ");

        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 - number2 == answer)
            System.out.println("Your answer correct! ");
        else{
            System.out.println("Your answer is Wrong. ");
            System.out.println(number1+ " - "+number2+" should be "+(number1 - number2));
        }
    }
}
