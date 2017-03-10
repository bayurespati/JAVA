package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 (Remove text) Write a program that removes all the occurrences of a specified string from a text file. For example,
 invoking java Exercise12_11 John filename
 removes the string John from the specified file. Your program should get the arguments from the command line.

 * Created by bnamora on 3/9/17.
 */
public class ex_11_ch_12_remove_text {
    public static void main(String[] args) throws Exception {
        File file = new File("score.txt");
        Scanner files = new Scanner(file);

        String copyString = "";
        while(files.hasNext()){
            String tempString = files.nextLine();
            String tempCopy = (tempString.charAt(0) == args[0].charAt(0)) ? tempString.replace(args[0]+" ","") : tempString.replace(" "+args[0],"");
            copyString += tempCopy+"\n";
        }

        try(PrintWriter temps = new PrintWriter(file)){
            temps.print(copyString);
        }
    }
}