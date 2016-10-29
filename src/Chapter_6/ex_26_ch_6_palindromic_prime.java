package Chapter_6;

/**
 * Created by DWP on 10/29/16.
 */
public class ex_26_ch_6_palindromic_prime {
    public static void main(String[] args) {
        printPalindromePrime(100);
    }

    public static void printPalindromePrime(int numberOfPalindromic){
        final int NUMBER_OF_PRIMES_PER_LINE = 10;
        int countNumberPalindromic = 0;

        for(int i = 2; countNumberPalindromic <= numberOfPalindromic; i++){

            if(isPalindrome(i)) {
                if (isPrime(i)) {
                    System.out.print(" " + i);
                    countNumberPalindromic++;

                    if(countNumberPalindromic % NUMBER_OF_PRIMES_PER_LINE == 0)
                        System.out.println();
                }
            }
        }
    }


    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }

    public static int reverse(int number){
        int lengthOfNumber = 1;
        for(int i = number; i > 0; i /=10){
            lengthOfNumber *= 10;
        }
        int reverseNumber = 0;
        int g = lengthOfNumber /10;
        for(int i = number, k = g; i > 0; i /=10, k /=10){
            int z = i % 10;
            reverseNumber += z * k;
        }
        return reverseNumber;
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
