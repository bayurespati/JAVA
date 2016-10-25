package Chapter_6;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_10_ch_6_use_the_prime_method {
    public static void main(String[] args) {
        printPrimeLess1000(10000);
    }

    public static void printPrimeLess1000(int limitPrime){
        final int NUMBER_OF_PRIMES_PER_LINE = 10;

        int count = 0;
        int number = 2;

        while(number < limitPrime){
            if(isPrime(number)) {
                count++;

                if (count % NUMBER_OF_PRIMES_PER_LINE == 0) {
                    System.out.printf("%-5s\n", number);
                } else
                    System.out.printf("%-5s", number);
            }
            number ++;
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
