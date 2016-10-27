package Chapter_6;

/**
 * Created by DWP on 10/27/16.
 */
public class ex_16_ch_6_number_of_days_in_a_year {
    public static void main(String[] args) {
        printDayOfYear(2000);
    }

    public static void printDayOfYear(int startYears){
        System.out.println("Total day from 2000 to 2020 is : "+numberOfDaysInAYear(startYears));
    }

    public static int numberOfDaysInAYear(int year){
        int totalYear = 0;
        for(int i = year; i <= 2020; i++){
            if(isLeapYears(i)){
                totalYear += 366;
            }
            else
                totalYear += 365;
        }
        return totalYear;
    }

    public static boolean isLeapYears(int year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 !=0);
    }
}
