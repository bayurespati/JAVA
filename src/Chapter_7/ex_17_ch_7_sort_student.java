package Chapter_7;

import java.util.Scanner;

/**
 * Created by DWP on 11/28/16.
 */
public class ex_17_ch_7_sort_student {
    public static void main(String[] args) {
        int numberOfStudent = getNumberOfStudent();

        String[] nameOfStudent = new String[numberOfStudent];
        int[] scoreOfStudent = new int [numberOfStudent];

        for(int i = 0; i < numberOfStudent; i++){
            System.out.print((i+1));
            nameOfStudent[i] = name();
            scoreOfStudent[i] = score();
        }

        selectionSort(scoreOfStudent,nameOfStudent);

        print(scoreOfStudent,nameOfStudent);
    }

    public static int getNumberOfStudent(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student : ");
        return input.nextInt();
    }

    public static String name(){
        Scanner input = new Scanner(System.in);
        System.out.print(". Input name of student : ");
        return input.nextLine();
    }

    public static int score(){
        Scanner input = new Scanner(System.in);
        System.out.print("Input score : ");
        return input.nextInt();
    }

    public static void selectionSort(int[] score, String [] name){
        for (int i = 0; i <score.length ; i++) {

            int currentMin = score[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < score.length; j++) {
                if (currentMin > score[j]) {
                    currentMin = score[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                score[currentMinIndex] = score[i];
                score[i] = currentMin;

                String temp = name[i];
                name[i] = name[currentMinIndex];
                name[currentMinIndex] = temp;
            }
        }
    }

    public static void print(int[] score,String[] name){
        for(int i = 0; i < score.length; i++){
            System.out.println(name[i]+"\t: "+score[i]);
        }
    }
}
