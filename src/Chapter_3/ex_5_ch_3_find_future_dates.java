package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.

 */
public class ex_5_ch_3_find_future_dates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int day = input.nextInt();
        System.out.print("Enter the number of day elapsed since today: ");
        int numberElapsedDay= input.nextInt();

        int futureDay = (day+numberElapsedDay)%7;

        System.out.print("Today is ");

        switch (day){
            case 0 :System.out.print(" Sunday "); break;
            case 1 :System.out.print(" Monday "); break;
            case 2 :System.out.print(" Tuesday "); break;
            case 3 :System.out.print(" Wednesday "); break;
            case 4 :System.out.print(" Thursday "); break;
            case 5 :System.out.print(" Friday "); break;
            case 6 :System.out.print(" Saturday "); break;
        }

        System.out.print("and the future is day is ");
        switch (futureDay){
            case 0 :System.out.print("Sunday"); break;
            case 1 :System.out.print("Monday"); break;
            case 2 :System.out.print("Tuesday"); break;
            case 3 :System.out.print("Wednesday"); break;
            case 4 :System.out.print("Thursday"); break;
            case 5 :System.out.print("Friday"); break;
            case 6 :System.out.print("Saturday"); break;
        }
    }
}
