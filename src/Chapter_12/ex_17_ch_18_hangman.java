package Chapter_12;

import java.io.File;
import java.util.Scanner;

/**
 * Created by bnamora on 3/10/17.
 */
public class ex_17_ch_18_hangman {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        File file = new File("src/Chapter_12/File_for_change/hangman.txt");

        while(true){
            Scanner files = new Scanner(file);
            String question = "";
            while (files.hasNext()){
                question = files.next();
                int random = (int) (Math.random() * 3);
                if(random == 0 ) {
                    break;
                }
            }
            System.out.println(question);
            playGame(question);

            System.out.println("Do you want to guess another word? Enter y or n");
            if(input.nextLine().toUpperCase().charAt(0) == 'N' )
                break;
        }
    }

    public static void playGame(String question){
        Scanner input = new Scanner(System.in);
        char[] answer = new char[26];
        int indexForAnswer = 0;

        boolean flag = true;

        while(flag) {
            System.out.print("(Guess) Enter a Letter in word ");
            printQuestion(question, answer);
            String temp = input.nextLine().toLowerCase();

            if (!question.contains(temp))
                System.out.println(temp.charAt(0) + " is not in the word!");

            if (checkAnswer(answer, temp)) {
                answer[indexForAnswer] = temp.charAt(0);
                indexForAnswer++;
            } else
                System.out.println(temp.charAt(0) + " is already in the word");
            flag = !(checkWord(answer, question));
        }
    }

    public static void printQuestion(String question,char[] answer){
        for (int i = 0; i < question.length(); i++) {
            if (checkQuestion(question, answer,i)) {
                System.out.print(question.charAt(i));
            } else
                System.out.print("*");
        }
        System.out.printf(" > ");
    }

    public static boolean checkQuestion(String question,char[] answer, int i){
        for(int k = 0; k < answer.length; k++){
            if(question.charAt(i) == answer[k]){
                return true;
            }
        }
        return false;
    }

    public static boolean checkAnswer(char[] answer, String temp){
        for(int i = 0; i < answer.length; i++){
            if(temp.charAt(0) == answer[i]){
                return false;
            }
        }
        return true;
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
}
