package Chapter_12;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by bnamora on 3/12/17.
 */
public class ex_29_ch_12_rename_file {
    public static void main(String[] args) {
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
                if (Character.isDigit(nameFile.charAt(i)) && !Character.isDigit(nameFile.charAt(i - 1)) &&
                        (nameFile.charAt(i - 1) == '_')) {
                    temp += "0" + nameFile.charAt(i);
                } else
                    temp += nameFile.charAt(i);
            }

            File newFilename = new File(temp);
            System.out.println( files.get(k).renameTo(newFilename) ? "Success" : "Filed" );
        }
    }
}
