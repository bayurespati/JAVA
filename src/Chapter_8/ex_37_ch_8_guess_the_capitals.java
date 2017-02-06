package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 2/6/17.
 */
public class ex_37_ch_8_guess_the_capitals {
    public static void main(String[] args) {
        String[][] countryAndCapital = {
                {"Indonesia","jakArta"},
                {"Thailand","bangkok"},
                {"Philippines","mAnila"},
                {"Cambodia","phnom Penh"},
                {"Malaysia","kualA lumpur"},
                {"Laos","vientIane"},
                {"Myanmar","naypyidaw"},
                {"Singapore","Singapore"},
                {"Vietnam","Hanoi"},
                {"Brunei","bandar sri begawan"}
        };

        int correctAnswer = getCorrectAnswer(countryAndCapital);
        System.out.println("The correct count is : "+correctAnswer);
    }

    public static int getCorrectAnswer(String[][] countryAndCapital){
        Scanner input = new Scanner(System.in);
        int correctAnswer = 0;

        for(int row = 0; row < countryAndCapital.length; row++){
            System.out.print("What is of Capital "+countryAndCapital[row][0]+" ? : ");
            String answer = input.nextLine();

            if(isCorrectAnswer(answer,countryAndCapital,row)){
                System.out.println("You answer is correct");
                correctAnswer++;
            }else{
                System.out.println("The correct Answer should be "+countryAndCapital[row][1]);
            }
        }
        return correctAnswer;
    }

    public static boolean isCorrectAnswer(String answer,String[][] countryAndCapital,int row){
        return answer.equalsIgnoreCase(countryAndCapital[row][1]);
    }
}
