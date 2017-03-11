package Chapter_12;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by bnamora on 3/11/17.
 */
public class ex_19_ch_12_count_words {
    public static void main(String[] args)  {
        try{
            URL url = new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
            int count = 0;
            Scanner input  = new Scanner(url.openStream());
            while (input.hasNext()){
                input.next();
                count++;
            }
            System.out.println("The URL have "+count+" word");
        }
        catch (java.io.IOException ex){
            System.out.println("I/O Errors : no such file");
        }
    }
}
