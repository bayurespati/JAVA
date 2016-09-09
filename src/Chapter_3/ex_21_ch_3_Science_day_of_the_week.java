package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/10/16.


 */
public class ex_21_ch_3_Science_day_of_the_week {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Year (e.g., 2015) : ");
        int year = input.nextInt();
        System.out.print("Enter month 1-12 : ");
        int month = input.nextInt();
        System.out.print("Enter the day of month : 1-31: ");
        int day = input.nextInt();

        boolean change = (month == 1);
        boolean change2 = (month == 2);
        if(change){
            month = 13;
            --year;
        }
        if(change2) {
            month = 14;
            --year;
        }
            int k = year % 100;
            int j = year / 100;
            int dayOfTheWeek = (day + ((26 * (month + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
            System.out.print("Day of the week is : ");
            switch (dayOfTheWeek) {
                case 0:System.out.print("Saturday");break;
                case 1:System.out.print("Sunday");break;
                case 2:System.out.print("Monday");break;
                case 3:System.out.print("Tuesday");break;
                case 4:System.out.print("Wednesday");break;
                case 5:System.out.print("Thursday");break;
                case 6:System.out.print("Friday");
            }

    }
}
