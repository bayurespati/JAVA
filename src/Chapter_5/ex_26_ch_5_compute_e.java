package Chapter_5;

/**
 * Created by DWP on 10/3/16.
 */
public class ex_26_ch_5_compute_e {
    public static void main(String[] args) {

        for (double i = 10000; i <= 100000; i += 10000) {

            double p2 = 0;
            double p1 = 1;
            for (double k = 1; k <= i; k++) {
                p1 *= k;
                p2 += 1 / p1;
            }
            System.out.println("e " + i + " : " + (1 + p2));
        }
    }
}
