package Chapter_12;

import java.util.Scanner;

/**
 * Created by bnamora on 3/6/17.
 */
public class eg_15_ch_12_ReadData {
    public static void main(String[] args) throws Exception {
        //Create file instance
        java.io.File file = new java.io.File("score.txt");

        //Create a Scanner for the file
        Scanner input = new Scanner(file);


        while(input.hasNext()){
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();

            int score = input.nextInt();

            System.out.println(firstName + " "+mi+" "+lastName+" "+score);
        }

        input.close();
    }
}
