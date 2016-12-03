package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 12/3/16.
 */
public class ex_35_ch_7_game_hangman {
    public static void main(String[] args) {
        String[] questionFix = {"dimas","selection","selected","option","cupukamu"};

        int randomQuestion = (int) (Math.random() * questionFix.length);
        String question = questionFix[randomQuestion];
        String answer = userAnswer(question);


        while (answer.charAt(0) == 'y') {
            randomQuestion = (int) (Math.random() * questionFix.length);
            question = questionFix[randomQuestion];
            answer = userAnswer(question);
        }
    }

    public static String userAnswer(String question) {

        Scanner input = new Scanner(System.in);
        char[] answer = new char[26];
        int indexForAnswer = 0;

        while (!checkWord(answer, question)) {

            System.out.print("(Guess) Enter a letter in word ");
            for (int i = 0; i < question.length(); i++) {
                if (printQuestion(question, answer,i)) {
                    System.out.print(question.charAt(i));
                } else
                    System.out.print("*");
            }
            System.out.printf(" > ");

            String temp = input.nextLine();

            if(checkAnswerWrong(question,temp)){
                System.out.println(temp.charAt(0)+" is not in the word");
            }

            if(checkAnswer(answer,temp)){
               answer[indexForAnswer] = temp.charAt(0);
               indexForAnswer++;
            }
            else
                System.out.println(temp.charAt(0)+" is already in the word");
        }


        System.out.println("Do you want to guess another word? Enter y or n");
        return input.nextLine();
    }


    public static boolean checkWord(char[] answer,String question){
        int countQuestion = 0;
        for(int i = 0; i < question.length(); i++){
            for(int k = 0; k < answer.length; k++){
                if(question.charAt(i) == answer[k]){
                    countQuestion++;
                }
            }
        }
        return (countQuestion == question.length());
    }

    public static boolean printQuestion(String question,char[] answer, int i){

        for(int k = 0; k < answer.length; k++){
            if(question.charAt(i) == answer[k]){
                return true;
            }
        }
        return false;
    }

    public static boolean checkAnswerWrong(String question,String temp){

        for(int i = 0; i < question.length(); i++){
            if(question.charAt(i) == temp.charAt(0)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkAnswer(char[] answer, String temp){

        for(int i = 0; i < answer.length; i++){
            if(temp.charAt(0) == answer[i]){
                return false;
            }
        }

        return true;
    }
}
