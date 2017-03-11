package Chapter_12;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Created by bnamora on 3/10/17.
 */
public class ex_18_ch_12_add_package_statement {
    public static void main(String[] args) throws Exception {
        File file = new File ("src/Chapter_12");
        ArrayList<File> listParent = getParent(file);

        for(int i = 0; i < listParent.size(); i++){
            File[] directory = listParent.get(i).listFiles();
            for(int k = 0; k < directory.length; k++){
                System.out.println(directory[k]);
                    if(directory[k].isDirectory()){
                        listParent.add(directory[k]);
                   }else{
                        try(PrintWriter files = new PrintWriter(directory[k])){
                            String temp = directory[k].getParent().replaceAll("/",".");
                            files.print("Package "+temp);
                        }
                    }
            }
        }
    }

    public static ArrayList<File> getParent(File file){
        File[] temp = file.listFiles(File::isDirectory);
        ArrayList<File> tempFile = new ArrayList<>();

        for(int i = 0; i < temp.length; i++){
            if(temp[i].getName().contains("Chapter")){
                tempFile.add(temp[i]);
            }
        }

        return tempFile;
    }
}