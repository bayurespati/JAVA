package Chapter_12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 3/11/17.
 */
public class ex_22_ch_12_replace_text {
    public static void main(String[] args) throws  Exception {
        File file = new File("src/Chapter_12");
        ArrayList<File> directory = getDirectory(file);
        ArrayList<File> files = getFile(directory);
        replaceFile(files);
    }

    public static ArrayList<File> getDirectory (File file){
        ArrayList<File> tempDirectory = new ArrayList<>();
        File[] tempFile = file.listFiles();
        for(int i = 0; i < tempFile.length; i++){
            if(tempFile[i].isDirectory() && tempFile[i].getName().contains("Chapter"))
                tempDirectory.add(tempFile[i]);
        }
        getAllDirectory(tempDirectory);
        return tempDirectory;
    }

    public static void getAllDirectory(ArrayList<File> tempDirectory){
        for(int i = 0; i < tempDirectory.size(); i++){
            File[] directory = tempDirectory.get(i).listFiles();
            for(int k = 0; k < directory.length; k++){
                if(directory[k].isDirectory()){
                    tempDirectory.add(directory[k]);
                }
            }
        }
    }

    public static ArrayList<File> getFile(ArrayList<File> files){
        ArrayList<File> file = new ArrayList<>();

        for(int i = 0; i < files.size(); i++ ){
            File[] directory = files.get(i).listFiles();
            for(int k = 0; k < directory.length; k++){
                if(directory[k].isFile()){
                    file.add(directory[k]);
                }
            }
        }

        return file;
    }

    public static void replaceFile(ArrayList<File> files) throws  Exception{
        for(int i = 0; i < files.size(); i++){
            Scanner file  = new Scanner(files.get(i));

            String copyString = "";
            while (file.hasNext()){
                copyString += file.nextLine().replaceAll("Package","Test")+"\n";
            }
            System.out.println(copyString);
            try(PrintWriter temps = new PrintWriter(files.get(i))){
                temps.print(copyString);
            }
        }
    }
}
//Package test