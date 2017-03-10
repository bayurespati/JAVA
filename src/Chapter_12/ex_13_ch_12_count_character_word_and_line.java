package Chapter_12;

import java.io.File;
import java.util.Scanner;

/**
 * Created by bnamora on 3/10/17.
 */
public class ex_13_ch_12_count_character_word_and_line  {
    public static void main(String[] args) throws Exception {
        File file = new File("score.txt");
        Scanner files = new Scanner(file);

        int totalCharacter = 0;
        int totalWord = 0;
        int totalLine = 0;

        while (files.hasNext()){
            String temp = files.nextLine();

            int countWord = 1;
            for(int i = 0; i < temp.length(); i++){
                if(temp.charAt(i) == ' '){
                    countWord++;
                }
            }

            totalWord += countWord;
            totalCharacter += temp.length();
            totalLine++;
        }

        System.out.println("Character : "+totalCharacter+"\nWord : "+totalWord+"\nLine : "+totalLine);
    }
}
