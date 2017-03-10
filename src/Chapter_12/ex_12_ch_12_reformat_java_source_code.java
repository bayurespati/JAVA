package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by bnamora on 3/10/17.
 */
public class ex_12_ch_12_reformat_java_source_code {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Chapter_12/File_for_change/File_ex12.java");
        Scanner files = new Scanner(file);

        String string = "";
        while (files.hasNext()){
            String temp =  files.nextLine();
            if(temp.length() > 0) {
                string += ((temp.charAt(temp.length() - 1) == '{')) ? temp.trim() : "\n"+temp;
            }
        }

        try(PrintWriter newFile = new PrintWriter(file)){
            newFile.print(string);
        }
        System.out.println(string);
    }
}
