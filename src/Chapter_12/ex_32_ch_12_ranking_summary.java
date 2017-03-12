package Chapter_12;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 3/12/17.
 */
public class ex_32_ch_12_ranking_summary {
    public static void main(String[] args) throws Exception {
        ArrayList<URL> file = getURLList();

        getName(file);
    }

    public static void getName(ArrayList<URL> file) throws Exception {
        System.out.println("Year\trank1\t\trank2\t\trank3\t\trank4\t\trank5\t\trank1\t\trank2\t\trank3\t\trank4\t\trank5");
        for(int i = 0, years = 2010; i < file.size(); i++,years-- ) {
            Scanner files = new Scanner(file.get(i).openStream());
            int count = 0;
            String[] femaleName = new String[5];
            String[] maleName = new String[5];

            while (files.hasNext() && count < 5) {
                files.nextInt();
                maleName[count] = files.next();
                files.nextDouble();
                femaleName[count] = files.next();
                files.nextDouble();
                count++;
            }
            System.out.print(years+"\t");
            printName(femaleName);
            printName(maleName);
            System.out.println();
        }
    }

    public static ArrayList<URL> getURLList() throws Exception{
        ArrayList<URL> file = new ArrayList<>();
        file.add(new URL("http://www.cs.armstrong.edu/liang/data/babynameranking2010.txt"));
        for(int i = 9; i > 0; i--){
            file.add(new URL("http://www.cs.armstrong.edu/liang/data/babynameranking200"+i+".txt"));
        }
        return file;
    }

    public static void printName(String[] femaleName){
        for(int i = 0; i < femaleName.length; i++){
            System.out.print(femaleName[i]+"\t\t");
        }
    }
}
