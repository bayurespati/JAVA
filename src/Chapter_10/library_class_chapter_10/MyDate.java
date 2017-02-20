package Chapter_10.library_class_chapter_10;

import java.util.GregorianCalendar;

/**
 * Created by bnamora on 2/18/17.
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    private String[] nameOfMonth = {"January","February","March","April","Mei","June","July","August","September","October","November","December"};


    public MyDate(){
        GregorianCalendar date = new GregorianCalendar();
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH);
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(long elapseTime){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapseTime);
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public MyDate(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear(){
        return year;
    }

    public String getMonth(){
        return nameOfMonth[month];
    }

    public int getDay(){
        return day;
    }

    public void setDate(long elapsedTime){
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        year = date.get(GregorianCalendar.YEAR);
        month = date.get(GregorianCalendar.MONTH);
        day = date.get(GregorianCalendar.DAY_OF_MONTH);
    }
}
