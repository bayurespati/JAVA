package Chapter_9;

import java.util.Date;

/**
 * Created by bnamora on 2/9/17.
 */
public class ex_3_ch_9_use_date_class {
    public static void main(String[] args) {
        Date[] date = createDateArray();
        displayDate(date);
    }

    public static Date[] createDateArray(){
        Date[] date = new Date[8];
        for(int i = 0, times = 10000; i < 8; i++, times *= 10){
            date[i] = new Date(times);
        }
        return date;
    }

    public static void displayDate(Date[] date){
        for(int i = 0; i < date.length; i++){
            System.out.println("Date array "+i+" : "+date[i].toString());
        }
    }
}
