package Chapter_5;

/**
 * Created by DWP on 10/3/16.
 */
public class ex_24_ch_5_sum_a_series {
    public static void main(String[] args) {
        double z = 0;
        for(double i = 97, j = 99; i >= 1; i -=2, j -=2){
            z += i/j;
        }
        System.out.println(z);
    }
}
