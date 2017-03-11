package Chapter_12;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by bnamora on 3/11/17.
 */
public class ex_23_ch_21_process_score_in_text_on_web {
    public static void main(String[] args) {
        try{
            URL url = new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
            Scanner input  = new Scanner(url.openStream());

            int total = 0;
            int numberOfData = 0;
            while (input.hasNext()){
                total += input.nextInt();
                numberOfData++;
            }
            System.out.println("Total is : "+total+" Average is : "+(total / numberOfData));
        }
        catch (java.io.IOException ex){
            System.out.println("I/O Errors : no such file");
        }

    }
}
