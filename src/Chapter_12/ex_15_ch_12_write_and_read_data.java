package Chapter_12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 3/10/17.
 */
public class ex_15_ch_12_write_and_read_data {
    public static void main(String[] args) throws IOException {
        File file = new File("Test.txt");


        try(PrintWriter newFile = new PrintWriter(file) ){
            for(int i = 0; i < 100; i++){
                newFile.print(((int) (Math.random()* 100 ) + 1)+" ");
            }
        }

        Scanner files = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<>();

        while(files.hasNext()){
            list.add(files.nextInt());
        }

        java.util.Collections.sort(list);
        System.out.println(list.toString());
    }
}
