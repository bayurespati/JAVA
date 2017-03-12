package Chapter_12;

import java.net.URL;
import java.util.Scanner;

/**
 * Created by bnamora on 3/12/17.
 */
public class ex_31_ch_12_baby_name_ranking {
    public static void main(String[] args) throws Exception {
        String year = getInput("year");
        String Gender = getInput("gender");
        String name = getInput("name");

        String forFile = "http://www.cs.armstrong.edu/liang/data/babynameranking"+year+".txt";
        URL file = new URL(forFile);
        Scanner files = new Scanner(file.openStream());

        int ranking = getRanking(files,name);
        printResult(ranking,name,year);
    }

    public static String getInput (String string){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter "+string+" : ");
        return input.next();
    }

    public static int getRanking(Scanner files, String name){
        int ranking = 0;
        while (files.hasNext()){
            String temp = files.nextLine();
            if(temp.contains(name))
                break;

            ranking++;
        }
        return ranking;
    }

    public static void printResult(int ranking,String name, String year){
        if(ranking < 1000){
            System.out.println(name+" is ranked #"+ranking+" years "+year);
        }else
            System.out.println("The name "+name+" is not ranked in year "+year);
    }
}
//http://www.cs.armstrong.edu/liang/data/babynameranking2010.txt
//http://www.cs.armstrong.edu/liang/data/babynameranking2010.txt