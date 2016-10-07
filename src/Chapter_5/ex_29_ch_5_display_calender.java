package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/7/16.
 */
public class ex_29_ch_5_display_calender {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input years : ");
        int inputYears = input.nextInt();
        System.out.print("Input day : ");
        int inputDay = input.nextInt();

        for(int month = 1; month < 13; month++){
            System.out.print("\t\t\t");
            switch (month) {
                case 1:
                    System.out.printf("Jan ");
                    break;
                case 2:
                    System.out.printf("Feb ");
                    break;
                case 3:
                    System.out.printf("Mar ");
                    break;
                case 4:
                    System.out.printf("Apr ");
                    break;
                case 5:
                    System.out.printf("Mei ");
                    break;
                case 6:
                    System.out.printf("Jun ");
                    break;
                case 7:
                    System.out.printf("Jul ");
                    break;
                case 8:
                    System.out.printf("Ags ");
                    break;
                case 9:
                    System.out.printf("Sep ");
                    break;
                case 10:
                    System.out.printf("Oct ");
                    break;
                case 11:
                    System.out.printf("Nov ");
                    break;
                case 12:
                    System.out.printf("Dec ");
                    break;
            }
            System.out.println(inputYears);
            System.out.println("\t---------------------------");
            System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");

            int totalDayMonth = 0;

            int firstDay = (inputDay+totalDayMonth) % 7;

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                totalDayMonth = 31;
            } else if (month == 2) {
                boolean isLeapYear = (inputYears % 4 == 0 && inputYears % 100 != 0) || (inputYears % 400 == 0);
                if (isLeapYear) {
                    totalDayMonth = 29;
                } else
                    totalDayMonth = 28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                totalDayMonth = 30;
            }

            int j = 1;
            for(int day =1; day <= totalDayMonth ; day++){
                for(int k = 1; k <= firstDay; k++){
                    System.out.print("\t");
                    j++;
                }
                System.out.print("\t"+day);
                if(j % 7 == 0) {
                    System.out.println();
                }
                j++;
                firstDay -=firstDay;
            }
            System.out.println();
            inputDay += totalDayMonth;
        }
    }
}
