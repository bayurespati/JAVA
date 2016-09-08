package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.
 *
 */
public class eg_9_ch_3_chinese_zodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = input.nextInt();

        switch (year % 12){
            case 0 : System.out.println("Monkey"); break;
            case 1 : System.out.println("rooster"); break;
            case 2 : System.out.println("dog"); break;
            case 3 : System.out.println("pig"); break;
            case 4 : System.out.println("rat"); break;
            case 5 : System.out.println("ox"); break;
            case 6 : System.out.println("tiger"); break;
            case 7 : System.out.println("rabbit"); break;
            case 8 : System.out.println("dragon"); break;
            case 9 : System.out.println("snake"); break;
            case 10 : System.out.println("horse"); break;
            case 11 : System.out.println("sheep");

        }
    }
}
