package Chapter_10;

import Chapter_10.library_class_chapter_10.Time;

/**
 * Created by bnamora on 2/16/17.
 */
public class ex_1_ch_10_the_time_class {
    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("time1 have "+time1.getHours()+" hours "+time1.getMinutes()+" minutes and "+time1.getSecond()+" second");
        Time time2 = new Time(555550000);
        System.out.println("time2 have "+time2.getHours()+" hours "+time2.getMinutes()+" minutes and "+time2.getSecond()+" second");
    }
}
