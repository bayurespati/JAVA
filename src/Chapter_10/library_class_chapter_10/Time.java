package Chapter_10.library_class_chapter_10;

/**
 * Created by bnamora on 2/16/17.
 */
public class Time {
    private long hours;
    private long minutes;
    private long second;

    public Time(){
        long totalMilliSecond = System.currentTimeMillis();
        long totalSecond = totalMilliSecond / 1000;
        this.second = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        this.minutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        this.hours = totalHour % 24;
    }

    public Time(long times){
        setTimes(times);
    }

    public long getHours(){
        return hours;
    }

    public long getMinutes(){
        return minutes;
    }

    public long getSecond(){
        return second;
    }

    public void setHours(long hours){
        this.hours = hours;
    }

    public void setMinutes(long minutes){
        this.minutes = minutes;
    }

    public void setSecond(long second){
        this.second = second;
    }

    public void setTimes (long elapseTime){
        long totalSecond = elapseTime / 1000;
        this.second = totalSecond % 60;
        long totalMinutes = totalSecond / 60;
        this.minutes = totalMinutes % 60;
        long totalHour = totalMinutes / 60;
        this.hours = totalHour % 24;
    }
}
