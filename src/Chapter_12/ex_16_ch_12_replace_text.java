package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by bnamora on 3/10/17.
 */
public class ex_16_ch_12_replace_text {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);

        Scanner files = new Scanner(file);

        String copyString = "";
        while (files.hasNext()) {
            String tempString = files.nextLine();
            String tempCopy = tempString.replace(args[1],args[2]);
            copyString += tempCopy + "\n";
        }
        try(PrintWriter newFile = new PrintWriter(file)){
            newFile.print(copyString);
        }
    }
}
