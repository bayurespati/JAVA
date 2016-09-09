package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/9/16.
 *
 */
public class ex_14_ch_3_game_head_or_tail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int)(Math.random() * 100) % 2;

        System.out.print("guess 0 = head  and 1 = tail : ");
        int head = input.nextInt();

        if(head == number){
            System.out.print("You correct ");
        }
        else
            System.out.println("FUCK YOU");
    }
}
