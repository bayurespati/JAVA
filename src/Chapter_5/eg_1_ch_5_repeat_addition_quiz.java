package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/27/16.i
 *
 */
public class eg_1_ch_5_repeat_addition_quiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);

        Scanner input = new Scanner(System.in);


        System.out.print("what is "+number1 +" + "+number2+" = ");
        int answer = input.nextInt();

        while (number1 + number2 != answer){
            System.out.printf("Wrong answer try again. what is "+number1+" + "+number2+"? ");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
    }
}
