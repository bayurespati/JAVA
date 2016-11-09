package Chapter_7;

import java.util.Scanner;

/**
 * Created by Sletszarr on 11/9/16.
 */
public class ex_1_ch_7_assign_grades {
    public static void main(String[] args) {
        int numberOfStudent = lenghtOfStudent();

        int[] scoreOfArray = getArray(numberOfStudent);

        int best = getBest(scoreOfArray);

        printfGrade(scoreOfArray, best);

    }

    public static int lenghtOfStudent (){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of student : ");
        return input.nextInt();
    }

    public static int[] getArray(int number){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter "+number+" scores : ");

        int[] scoreOfStudent = new int[number];

        for(int i = 0; i < scoreOfStudent.length; i++) {
            scoreOfStudent[i] = input.nextInt();
        }

        return scoreOfStudent;
    }

    public static void printfGrade(int[] score, int best){

        for(int i = 0; i < score.length; i++){
            System.out.println("Student "+i+" score is "+score[i]+" and grade is "+getGrade(score[i],best));
        }
    }

    public static int getBest(int[] score){

        int best = score[0];

        for(int k = 1; k < score.length ; k++){
            if(best > score[k])
                best = best;
            else
                best =score[k];
        }
        return best;
    }

    public static char getGrade(int score, int best){
        if(score >=  (best - 10))
            return 'A';
        else if (score >= (best - 20))
            return'B';
        else if (score >=  (best - 30))
            return 'C';
        else if (score >= (best - 40))
            return 'D';
        else
            return 'F';
    }
}
