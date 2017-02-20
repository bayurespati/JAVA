package Chapter_10;

import Chapter_10.library_class_chapter_10.MyDate;

/**
 * Created by bnamora on 2/18/17.
 */
public class ex_14_ch_10_the_MyDate_class {
    public static void main(String[] args) {
        MyDate dateToday = new MyDate();
        System.out.println("years : "+dateToday.getYear()+" month : "+dateToday.getMonth()+" day : "+dateToday.getDay());
        MyDate dateToday1 = new MyDate(34355555133101L);
        System.out.println("years : "+dateToday1.getYear()+" month : "+dateToday1.getMonth()+" day : "+dateToday1.getDay());
    }
}
