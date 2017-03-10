package Chapter_12;

import java.io.File;
import java.util.Scanner;

/**
 * Created by bnamora on 3/10/17.
 */
public class ex_14_ch_12_process_score_in_a_text_file {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Chapter_12/File_for_change/File_ex14.txt");
        Scanner files = new Scanner(file);
        int total = 0;
        int count = 0;
        while(files.hasNext()){
            total += files.nextInt();
            count++;
        }
        int average = total / count;
        System.out.println("Total : "+total+"\nAverage : "+average);
    }
}
