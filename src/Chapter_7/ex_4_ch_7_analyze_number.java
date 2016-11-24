package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/24/16.
 */
public class ex_4_ch_7_analyze_number {
    public static void main(String[] args) {
        int[] score = getScore();

        int avg = getAvg(score);

        printScore(avg,score);
    }

    public static void printScore(int avg, int[] score){

        int aboveAvg = 0;
        int equalAvg = 0;
        int belowAvg = 0;


        for(int i = 0; i < score.length; i++){
            if(score[i] !=0){
                if(score[i] > avg){
                    aboveAvg++;
                }
                else if(score[i] == avg){
                    equalAvg++;
                }
                else
                    belowAvg++;
            }
        }
        System.out.println("Avg is : "+avg);

        System.out.println("Above to avg is : "+aboveAvg+" times");
        System.out.println("Equal to avg is : "+equalAvg+" times");
        System.out.println("Below to avg is : "+belowAvg+" times");
    }

    public static int getAvg(int[] score){

        int totalScore = 0;
        int countScore = 0;

        for(int i = 0; i < score.length; i++){
            if(score[i] < 0){
                break;
            }
            totalScore += score[i];
            countScore++;
        }

        return totalScore / countScore;
    }

    public static int[] getScore(){
        Scanner input =  new Scanner(System.in);

        int[] score = new int [100];
        System.out.print("Enter score : ");

        int num = 1;
        int index = 0;

        while (num >= 0){

            int temp = input.nextInt();
            score[index] = temp;

            index++;
            num = temp;
        }

        return score;
    }
}
