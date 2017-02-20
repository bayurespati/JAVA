package Chapter_10;

import java.math.BigDecimal;


/**
 * Created by bnamora on 2/20/17.
 */
public class ex_20_ch_10_approximate_e {
    public static void main(String[] args) {
        for (double i = 100; i <= 1000; i +=100) {
            BigDecimal result = new BigDecimal(0);
            for (double k = 1; k <= i; k++) {
                BigDecimal factorial = getFactorial(k);
                result = result.add(factorial);
            }
            System.out.println("E "+i+" : "+result.add(new BigDecimal(1)));
        }
    }

    public static BigDecimal getFactorial(double k){
        BigDecimal factorial = new BigDecimal(1);
        for(int m = 1; m <= k; m++){
            factorial = factorial.multiply(new BigDecimal(m));
        }
        return new BigDecimal(1).divide(factorial,25,BigDecimal.ROUND_UP);
    }
}
