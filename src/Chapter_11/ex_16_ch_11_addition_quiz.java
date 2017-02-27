package Chapter_11;


import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 2/27/17.
 */
public class ex_16_ch_11_addition_quiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random()*10);
        int number2 = (int) (Math.random()*10);

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> answerList = new ArrayList<>();

        System.out.print("what is "+number1 +" + "+number2+" = ");
        int answer = input.nextInt();

        while (number1 + number2 != answer){
            System.out.printf("Wrong answer try again. what is "+number1+" + "+number2+"? ");
            answer = input.nextInt();
            answerList.add(answer);

            if(answerList.contains(answer)){
                System.out.println("Your already answer "+answer);
            }
        }
        System.out.println("You got it!");
    }
}
