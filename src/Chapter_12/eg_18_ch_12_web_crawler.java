package Chapter_12;

import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bnamora on 3/7/17.
 */
public class eg_18_ch_12_web_crawler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a URL: ");
        String url = input.nextLine();
        crawler(url);
    }

    public static void crawler(String url){
        ArrayList<String> listOfPendingURLs = new ArrayList<>();
        ArrayList<String> listOfTraverseURLs = new ArrayList<>();

        listOfPendingURLs.add(url);

        while (!listOfPendingURLs.isEmpty() && listOfTraverseURLs.size() <= 100){
            String urlString = listOfPendingURLs.remove(0);
            if(!listOfTraverseURLs.contains(urlString)){
                listOfTraverseURLs.add(urlString);
                System.out.println("Craw "+urlString);

                for(String s : getSubURLs(urlString)){
                    if(!listOfTraverseURLs.contains(s))
                        listOfPendingURLs.add(s);
                }
            }
        }
    }

    public static ArrayList<String> getSubURLs(String urlString){
        ArrayList<String> list = new ArrayList<>();

        try{
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            int current  = 0;
            while(input.hasNext()){
                String line = input.nextLine();
                current = line.indexOf("http:",current);
                while (current > 0){
                    int endIndex = line.indexOf("\"",current);
                    if(endIndex > 0){
                        list.add(line.substring(current,endIndex));
                        current = line.indexOf("http:",endIndex);
                    }else{
                        current = -1;
                    }
                }
            }
        }
        catch (Exception ex){
            System.out.println("Error : "+ex.getMessage());
        }

        return list;
    }
}
