package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 9/28/16.
 */
public class ex_8_ch_5_find_the_highest_score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input number of student : ");
        int numberStudent = input.nextInt();

        int score ;
        int maxScore = 0;
        String nameMax = "";

        for (int j = 0; j < numberStudent; j++){
            System.out.print("Input name : ");
            String name = input.next();
            System.out.print("Input score : ");
            score = input.nextInt();
            if(score > maxScore){
                maxScore = score;
                nameMax = name;
            }
        }

        System.out.println(nameMax+" Has a Highest score : "+maxScore);
    }
}
