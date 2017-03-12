package Chapter_12;

import java.io.File;
import java.util.Scanner;

/**
 * Created by bnamora on 3/12/17.
 */
public class ex_26_ch_12_create_a_directory {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter name of Directory : ");
        String nameDirectory = input.next();
        File file = new File(nameDirectory);

        if(file.mkdir()){
            System.out.println("Directory created successfully");
        }else
            System.out.println("Directory already exists");
    }
}