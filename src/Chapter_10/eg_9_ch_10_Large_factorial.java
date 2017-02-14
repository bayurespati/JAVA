package Chapter_10;

import java.math.BigInteger;

/**
 * Created by bnamora on 2/14/17.
 */
public class eg_9_ch_10_Large_factorial {
    public static void main(String[] args) {
        System.out.println("50! is \n"+factorial(50));
    }

    public static BigInteger factorial(long n){
        BigInteger result = BigInteger.ONE;
        for(int i = 1; i <= n; i++){
            result = result.multiply(new BigInteger(i + ""));
        }
        return result;
    }
}
