package Chapter_10;

import java.math.BigInteger;

/**
 * Created by bnamora on 2/20/17.
 */
public class ex_17_ch_10_square_number {
    public static void main(String[] args) {
        BigInteger starNumber = new BigInteger((long) Math.sqrt(Long.MAX_VALUE)+"").add(new BigInteger("1"));
        System.out.println("10 square number greater than Long MAX.VALUE ");
        for(int i = 0; i < 10; i++){
                System.out.println(starNumber.multiply(starNumber));
                starNumber = starNumber.add(new BigInteger("1"));
        }
    }
}