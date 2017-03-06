package Chapter_12;

import java.io.PrintWriter;

/**
 * Created by bnamora on 3/6/17.
 */
public class eg_14_ch_12_WriteDataWithAutoClose {
    public static void main(String[] args) throws Exception {
        java.io.File file = new java.io.File("score.txt");
        if(file.exists()){
            System.out.println("File already exists");
            System.exit(0);
        }

        try (java.io.PrintWriter output = new PrintWriter(file)){
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
    }
}
