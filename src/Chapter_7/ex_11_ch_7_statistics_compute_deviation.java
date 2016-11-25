package Chapter_7;

/**
 * Created by DWP on 11/25/16.
 */
public class ex_11_ch_7_statistics_compute_deviation {
    public static void main(String[] args) {
        double[] number = ex_8_ch_7_average_an_array.getNumber();
        double mean = ex_8_ch_7_average_an_array.getAverage(number);
        double deviation = getDeviation(number, mean);

        print(mean,deviation);
    }


    public static double getDeviation(double[] number, double mean){
        double totalX = 0;
        for(int i = 0; i < number.length; i++){
            totalX += Math.pow((number[i]- mean), 2);
        }
        return Math.sqrt(totalX / (number.length - 1));
    }

    public static void print(double mean, double deviation){
        System.out.printf("The mean is : %.2f \n",mean);
        System.out.printf("The Standard Deviation is : %.5f",deviation);
    }
}
