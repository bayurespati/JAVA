package Chapter_6;

/**
 * Created by DWP on 10/29/16.
 */
public class ex_29_ch_6_twin_prime {
    public static void main(String[] args) {
        printTwinPrime(2);
    }

    public static void printTwinPrime(int number){
        int twinPrime = 0;

        int firstPrime  = 0;
        int secondPrime = 0;

        for(int i = number ; twinPrime <= 1000; i++){
            if(isPrime(i)) {
                firstPrime = i;
                secondPrime = firstPrime + 2;
                if(isPrime(secondPrime)){
                    System.out.printf("(%d,%d)\n",firstPrime,secondPrime);
                    twinPrime++;
                }
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
