package Chapter_6;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_9_ch_6_conversion_between_feet_and_meters {
    public static void main(String[] args) {
        double feet = 1;
        double meter = 20;
        printTable(feet,meter);
    }
    public static void printTable(double feet, double meter){
        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tcelsius");
        for(double i = feet, j = meter; i <= 10; i++, j +=5){
            System.out.printf("%.0f\t\t%.3f\t\t|\t%.0f\t\t\t%.3f\n",i,footToMeter(i),j,meterToFoot(j));
        }
    }

    public static double footToMeter(double feet){
        double meter = 0.305 * feet;
        return meter;
    }

    public static double meterToFoot(double meter){
        double feet = 3.279 * meter;
        return feet;
    }
}
