package Chapter_9;

import java.util.GregorianCalendar;

/**
 * Created by bnamora on 2/9/17.
 */
public class ex_5_ch_9_use_the_gregorian_calender {
    public static void main(String[] args) {
        GregorianCalendar calender = new GregorianCalendar();

        System.out.println(" Day "+calender.get(GregorianCalendar.DAY_OF_MONTH) +
                " Month "+calender.get(GregorianCalendar.MONTH) +
                " Year "+calender.get(GregorianCalendar.YEAR));

        calender.setTimeInMillis(1234567898765L);

        System.out.println(" Day "+calender.get(GregorianCalendar.DAY_OF_MONTH) +
                " Month "+calender.get(GregorianCalendar.MONTH) +
                " Year "+calender.get(GregorianCalendar.YEAR));

    }
}
