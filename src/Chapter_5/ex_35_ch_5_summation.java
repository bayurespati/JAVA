package Chapter_5;

/**
 * Created by DWP on 10/10/16.
 */
public class ex_35_ch_5_summation {
    public static void main(String[] args) {

        double sum = 0;

        for(double i = 1, k = 2; i <= 624; i++, k ++){

            sum += 1 / ( Math.pow(i, 0.5) + Math.pow(k, 0.5) );
        }
        System.out.println(sum);
    }
}
