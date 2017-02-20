package Chapter_10;

import java.math.BigInteger;

/**
 * Created by bnamora on 2/20/17.
 */
public class ex_18_ch_10_large_prime_number {
    public static void main(String[] args) {
        BigInteger startNumber = new BigInteger(Long.MAX_VALUE + "").add(new BigInteger("1"));
        int count = 0;
        System.out.println("five large prime number ");
        while (count < 5 ){
            if(startNumber.isProbablePrime(1)){
                System.out.println(startNumber);
                count++;
            }
            startNumber = startNumber.add(new BigInteger("1"));
        }
    }
}
