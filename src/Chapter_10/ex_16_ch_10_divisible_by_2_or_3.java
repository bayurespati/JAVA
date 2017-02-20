package Chapter_10;

import java.math.BigInteger;

/**
 * Created by bnamora on 2/20/17.
 */
public class ex_16_ch_10_divisible_by_2_or_3 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger("10000000000000000000000000000000000000000000000000");
        int count = 0;
        System.out.println("Ten number 50 digit divisible 2 and 3 ");
        while (count != 10){
            BigInteger zero = new BigInteger("0");
            if( number.remainder(new BigInteger("2")).equals(zero) || number.remainder(new BigInteger("3")).equals(zero)){
                System.out.println(number);
                count++;
            }
            number = number.add(new BigInteger("1"));
        }
    }
}
