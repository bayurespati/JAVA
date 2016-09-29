package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/28/16.
 */
public class ex_9_ch_5_find_two_higest_score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input number of student : ");
        int numberStudent = input.nextInt();
        int score ;
        int secScore = 0;
        int maxScore = 0;
        int tempSec;

        String nameMax = "";
        String secNameMax= "";

        for (int j = 0; j < numberStudent; j++){

            System.out.print("Input name : ");
            String name = input.next();
            System.out.print("Input score : ");
            score = input.nextInt();

           if(score >= maxScore){
               secNameMax= name;
               secScore = maxScore;
               nameMax = name;
               maxScore = score;
           }
           if(score > secScore && score < maxScore){
               tempSec = score;
               secScore = tempSec;
           }

        }
        System.out.println(secNameMax+" Second Highest Score : "+secScore);
        System.out.println(nameMax+" Has a Highest score : "+maxScore);

        }
}
