package Chapter_12;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by bnamora on 3/12/17.
 */
public class ex_27_ch_12_replace_directory {
    public static void main(String[] args) throws Exception {
        File file = new File("src/Directory");
        ArrayList<File> files = getFile(file);
        replaceName(files);
    }

    public static ArrayList<File> getFile(File file){
        ArrayList<File> files = new ArrayList<>();
        File[] tempFile = file.listFiles();

        for(int i = 0; i < tempFile.length; i++){
            if(tempFile[i].isFile()) {
                files.add(tempFile[i]);
            }else if(tempFile[i].isDirectory()){
                addFileFromDirectory(tempFile[i],files);
            }
        }

        return files;
    }

    public static void addFileFromDirectory(File file,ArrayList<File> files){
        File[] tempFile = file.listFiles();
        for(int i = 0; i < tempFile.length; i++){
            if(tempFile[i].isFile()) {
                files.add(tempFile[i]);
            }else if(tempFile[i].isDirectory()){
                addFileFromDirectory(tempFile[i],files);
            }
        }
    }

    public static void replaceName(ArrayList<File> files){

        for(int k = 0; k < files.size(); k++) {
            String temp = "";
            String nameFile = files.get(k).toString();
            for (int i = 0; i < nameFile.length(); i++) {
                if (Character.isDigit(nameFile.charAt(i)) && !Character.isDigit(nameFile.charAt(i + 1)) &&
                        !Character.isDigit(nameFile.charAt(i - 1))) {
                    temp += "0" + nameFile.charAt(i);
                } else
                    temp += nameFile.charAt(i);
            }

            File newFilename = new File(temp);

            System.out.println( files.get(k).renameTo(newFilename) ? "Success" : "Filed" );
        }
    }
}
/*

(Replace words) Suppose you have a lot of files in a directory that contain words Exercisei_j,
where i and j are digits. Write a program that pads a 0 before i if i is a single digit
and 0 before j if j is a single digit. For example, the word Exercise2_1.txt in a
file will be replaced by Exercise02_01. In Java, when you pass the symbol * from the command line,
it refers to all files in the directory (see Supplement III.V). Use the following command to run your program.
 */