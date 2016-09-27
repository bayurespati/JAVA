package Chapter_5;

/**
 * Created by DWP on 9/27/16.
 */
public class eg_10_ch_5_future_tuition {
    public static void main(String[] args) {
        double tuition = 10000;
        int year = 0;

        while(tuition<20000){
            tuition = tuition * 1.07;
            year++;
        }
        System.out.println("Tuition will be doubled in "+year+" years");
        System.out.printf("Tuition will be $%.2f in %1d years", tuition,year);
    }
}
