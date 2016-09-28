package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/28/16.
 */
public class ex_2_ch_5_repeat_additions {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 10;

        int correctCount = 0;
        int count = 0;

        long startTime = System.currentTimeMillis();
        String output = " ";
        Scanner input = new Scanner(System.in);

        while (count < NUMBER_OF_QUESTIONS){
            int number1 = (int) (1+Math.random()*15);
            int number2 = (int) (1+Math.random()*15);


            if(number1 < number2){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            System.out.print("what is "+number1+" - "+number2+" ? ");
            int answer = input.nextInt();

            if(number1 - number2 == answer){
                System.out.println("You are correct!");
                correctCount++;
            }
            else
                System.out.println("what is "+number1+" - "+number2+"Should be "+(number1-number2));

            count++;
            output +="\n"+number1+" - "+number2+" = "+answer+((number1 - number2 == answer)?" correct " : " wrong ");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;

        System.out.println("Correct count is "+correctCount+"\nTest time is "+testTime/1000+" second\n"+output);
    }
}
