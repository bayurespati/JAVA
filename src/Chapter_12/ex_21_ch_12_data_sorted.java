package Chapter_12;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 3/11/17.
 */
public class ex_21_ch_12_data_sorted {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Chapter_12/File_for_change/File_ex14.txt");
        Scanner files = new Scanner(file);

        ArrayList<Integer> list = new ArrayList<>();

        while (files.hasNext()){
            list.add(files.nextInt());
        }

        if(isSorted(list)){
            System.out.println("Data Sorted");
        }else{
            for(int i = 0; i < 2; i++)
                System.out.println(list.get(i));
        }
    }

    public static boolean isSorted(ArrayList<Integer> files){
        for(int i = 0; i < files.size(); i++){
            for(int k = i+1; k < files.size(); k++){
                if(files.get(i) > files.get(k))
                    return false;
            }
        }
        return true;
    }
}
