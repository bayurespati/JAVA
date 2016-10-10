package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/10/16.
 */
public class ex_34_ch_5_game_scissor_rock_paper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m = 0;
        int i = 0;

        do {
            int computer = (int)(Math.random()*3);
            System.out.print("Scissor(0), rock(1), paper(2): ");
            int user = input.nextInt();

            System.out.print("The computer is");
            switch (computer) {
                case 0:
                    System.out.print(" Scissor ");
                    break;
                case 1:
                    System.out.print(" Rock ");
                    break;
                case 2:
                    System.out.print(" Paper ");
            }

            System.out.print("You are ");
            switch (user) {
                case 0:
                    System.out.print(" Scissor ");
                    break;
                case 1:
                    System.out.print(" Rock ");
                    break;
                case 2:
                    System.out.print(" Paper ");
            }

            boolean win = (user == 2 && computer == 1)||(user == 1 && computer == 0)||(user == 0 && computer == 2);

            if (user == computer) {
                System.out.println("too. it is draw");
            }
            else if (win) {
                System.out.println("You won");
                i++;
            }
            else {
                System.out.println("Computer won");
                m++;
            }

            System.out.println("Computer won : "+m);
            System.out.println("You won : "+i);

        }while(i - m !=3 && m - i !=3);
    }
}
