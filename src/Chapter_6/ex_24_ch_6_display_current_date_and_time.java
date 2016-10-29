package Chapter_6;

/**
 * Created by DWP on 10/28/16.
 */
public class ex_24_ch_6_display_current_date_and_time {
    public static void main(String[] args) {
        long totalMilliSecond = System.currentTimeMillis();
        int startYears = 1970;

        printFuckDayAndTime(totalMilliSecond,startYears);
    }

    public static void printFuckDayAndTime(long time, int startYears){
        long totalSecond = time / 1000;
        long totalMinutes = totalSecond / 60;
        long totalHour = totalMinutes / 60;
        long totalDay = totalHour / 24;
        int totalMonth = getTotalMonth(totalDay,startYears);


        long currentHour = getHour(totalHour) + 7;
        long currentYears = startYears + (totalMonth / 12);
        int currentMonth = totalMonth % 12;
        long currentDays = getCurrentDay(totalDay,startYears)+1;


        if(currentHour > 11){
            double hourPm = currentHour % 12;
            if(hourPm < 1){
                hourPm = 12;
            }
            System.out.println((int)+hourPm+" : "+getMinutes(totalMinutes)+" : "+getSecond(totalSecond)+ " PM");
        }
        else
            System.out.println((int)+currentHour+" : "+getMinutes(totalMinutes)+" : "+getSecond(totalSecond)+ " AM");
        System.out.println(currentDays+" "+getMonthName(currentMonth)+" "+currentYears);
    }

    public static long getSecond(long second){
        long currentSecond = second % 60;
        return currentSecond;
    }

    public static long getMinutes(long minute){
        long currentMinute = minute % 60;
        return currentMinute;
    }

    public static long getHour(long hour){
        long currentHour =  hour % 24;
        return currentHour;
    }

    public static long getCurrentDay(long totalDay , int startYears){
        long dayOfZeus = 0;

        for(long i = totalDay; i > 31;){
            for(long month = 1; month <= 12; month++) {
                dayOfZeus = i;
                if(i <= 31){
                    break;
                }
                i -= getNumberOfDaysInMonth(startYears, month);
            }
            startYears++;
        }

        if(dayOfZeus == 31){
            dayOfZeus = 1;
        }

        return dayOfZeus;
    }

    public static int getTotalMonth(long totalDay, int startYears){

        int totalMonth = 0;
        for(long i = totalDay; i >= 1;){
            for(long month = 1; month <= 12; month++) {
                i -= getNumberOfDaysInMonth(startYears, month);
                totalMonth++;
                if(i <= 28){
                    break;
                }
            }
            startYears ++;
        }
        return totalMonth;
    }

    public static String getMonthName(int month){
        String monthName ="";
        switch (month){
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
        return monthName;
    }

    public static int getNumberOfDaysInMonth(long year, long month){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if(month == 2)
            return isLeapYear(year) ? 29 : 28;

        return 0;
    }

    public static boolean isLeapYear(long year){
        return year % 400 == 0 || (year % 4 == 0 && year % 100 !=0);
    }
}
