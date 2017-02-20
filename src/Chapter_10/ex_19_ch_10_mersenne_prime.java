package Chapter_10;

import java.math.BigInteger;

/**
 * Created by bnamora on 2/20/17.
 */
public class ex_19_ch_10_mersenne_prime {
    public static void main(String[] args) {
        System.out.println("Mersenne Prime ");
        System.out.println("P\t\t\t\t2^P-1");
        for(int i = 2; i <= 100; i++){
           if(isPrime(i)){
               System.out.println(i+"\t\t\t\t"+new BigInteger("2").pow(i).subtract(new BigInteger("1")));
           }
        }
    }

    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number/2; divisor++){
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
