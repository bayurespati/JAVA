package Chapter_10;

import java.math.BigInteger;

/**
 * Created by bnamora on 2/20/17.
 */
public class ex_21_ch_10_divisible_by_5_or_6 {
    public static void main(String[] args) {
        BigInteger startNumber = new BigInteger(Long.MAX_VALUE+"").add(new BigInteger("1"));

        int count  = 0;
        System.out.println("10 number divisible 5 and 6 ");
        while(count < 10){
            if(startNumber.remainder(new BigInteger("5")).equals(new BigInteger("0")) || startNumber.remainder(new BigInteger("6")).equals(new BigInteger("0"))   ){
                System.out.println(startNumber);
                count++;
            }
            startNumber = startNumber.add(new BigInteger("1"));
        }
    }
}