package Chapter_12;

import java.io.IOException;

/**
 * Created by bnamora on 3/6/17.
 */
public class eg_13_ch_12_write_data {
    public static void main(String[] args) throws IOException {
        java.io.File file = new java.io.File("score.txt");

        if(file.exists()){
            System.out.println("File already exists");
            System.exit(1);
        }

        java.io.PrintWriter output = new java.io.PrintWriter(file);

        output.print("John T smith ");
        output.println(90);
        output.print("Eric k jones ");
        output.println(85);

        output.close();
    }
}
