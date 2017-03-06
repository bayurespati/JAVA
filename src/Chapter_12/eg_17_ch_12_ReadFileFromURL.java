package Chapter_12;

import java.net.URL;
import java.util.Scanner;

/**
 *
 * Created by bnamora on 3/6/17.
 */
public class eg_17_ch_12_ReadFileFromURL {
    public static void main(String[] args) {
        System.out.print("Enter a URL : ");
        String URLString = new Scanner(System.in).next();

        try{
            URL url = new URL(URLString);
            int count = 0;
            Scanner input  = new Scanner(url.openStream());
            while (input.hasNext()){
                String line = input.nextLine();
                count += line.length();
            }
            System.out.println("The file size is "+count+" Character");
        }
        catch (java.net.MalformedURLException ex){
            System.out.println("Invalid URL");
        }
        catch (java.io.IOException ex){
            System.out.println("I/O Errors : no such file");
        }
    }
}
//https://www.youtube.com/watch?v=qOrXWhmUbJ0
//http://www.yahoo.com
//http://cs.armstrong.edu/liang/data/Lincoln.txt