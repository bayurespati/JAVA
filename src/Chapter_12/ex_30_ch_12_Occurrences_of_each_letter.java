package Chapter_12;

import java.io.File;
import java.util.Scanner;

/**
 * Created by bnamora on 3/12/17.
 */
public class ex_30_ch_12_Occurrences_of_each_letter {
    public static void main(String[] args) throws Exception {
        File file = new File("ex_30_ch_12.txt");
        Scanner files = new Scanner(file);
        int[] letter = new int[26];

        while (files.hasNext()){
            String temp = files.next().toLowerCase();
            for(int i = 0; i < temp.length(); i++){
                if(Character.isLetter(temp.charAt(i))){
                    letter[temp.charAt(i) - 'a'] ++;
                }
            }
        }

        for(int i = 0; i < letter.length; i++){
            System.out.println("Number of "+(char) ('A' + i)+" : "+letter[i]);
        }
    }
}
