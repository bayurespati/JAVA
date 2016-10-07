package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/4/16.
 */
public class ex_28_ch_5_Display_the_frist_day_of_each_month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input years : ");
        int inputYears = input.nextInt();
        System.out.print("Input day : ");
        int inputDay = input.nextInt();

        for (int month = 0; month < 12; month++) {

            switch (month) {
                case 0:
                    System.out.printf("Jan");
                    break;
                case 1:
                    System.out.printf("Feb");
                    break;
                case 2:
                    System.out.printf("Mar");
                    break;
                case 3:
                    System.out.printf("Apr");
                    break;
                case 4:
                    System.out.printf("Mei");
                    break;
                case 5:
                    System.out.printf("Jun");
                    break;
                case 6:
                    System.out.printf("Jul");
                    break;
                case 7:
                    System.out.printf("Ags");
                    break;
                case 8:
                    System.out.printf("Sep");
                    break;
                case 9:
                    System.out.printf("Oct");
                    break;
                case 10:
                    System.out.printf("Nov");
                    break;
                case 11:
                    System.out.printf("Dec");
                    break;
            }
            System.out.print(" 1 " + inputYears + " is ");
            int totalDayMonth = 0;

            if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10) {
                totalDayMonth = +31;
            } else if (month == 2) {
                boolean isLeapYear = (inputYears % 4 == 0 && inputYears % 100 != 0) || (inputYears % 400 == 0);
                if (isLeapYear) {
                    totalDayMonth = +29;
                } else
                    totalDayMonth = +28;
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                totalDayMonth = 30;
            }
            int firstDayInMonth = (inputDay + totalDayMonth) % 7;
            switch (firstDayInMonth) {
                case 0:
                    System.out.print("Sunday");
                    break;
                case 1:
                    System.out.print("Monday");
                    break;
                case 2:
                    System.out.print("Tuesday");
                    break;
                case 3:
                    System.out.print("Wednesday");
                    break;
                case 4:
                    System.out.print("Thursday");
                    break;
                case 5:
                    System.out.print("Friday");
                    break;
                case 6:
                    System.out.print("Saturday");
                    break;
            }
            inputDay += totalDayMonth;
            System.out.println();
        }

    }
}
