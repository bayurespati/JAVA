package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/9/16.
 *
 */
public class ex_17_ch_3_game_scissor_rock_paper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int computer = (int) (Math.random() * 3);

        System.out.print("Scissor(0), rock(1), paper(2): ");
        int user = input.nextInt();

        System.out.print("The computer is");

        switch (computer){
            case 0 : System.out.print(" Scissor ");break;
            case 1 : System.out.print(" Rock ");break;
            case 2 : System.out.print(" Paper ");
        }
        System.out.print("You are ");
        switch (user){
            case 0 : System.out.print(" Scissor ");break;
            case 1 : System.out.print(" Rock ");break;
            case 2 : System.out.print(" Paper ");
        }

        boolean case1 = (user==2 && computer==0);

        if(user == computer)
            System.out.print("too. it is draw");
        else if(case1)
            System.out.print("You Lose");
        else if(user > computer)
            System.out.print("You won");
        else
            System.out.print("You lose");
    }
}
