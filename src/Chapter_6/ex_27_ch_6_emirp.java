package Chapter_6;

/**
 * Created by DWP on 10/29/16.
 */
public class ex_27_ch_6_emirp {
    public static void main(String[] args) {
        printEmirp(100);
    }

    public static void printEmirp(int number) {
        int NUMBER_OF_LINE = 10;
        int countEmirp = 0;
        int i = 0;

        while (countEmirp <= number) {
            if (!isPalindrome(i) && isPrime(i)) {

                int b = reverse(i);

                if (isPrime(b)) {
                    System.out.print(" " + i);
                    countEmirp++;
                    if (countEmirp % NUMBER_OF_LINE == 0)
                        System.out.println();
                }

            }
            i++;
        }
    }


    public static boolean isPalindrome(int number) {
        return number == reverse(number);
    }

    public static int reverse(int number) {
        int lengthOfNumber = lengOfNumber(number);
        int reverseNumber = 0;

        while (lengthOfNumber > 0) {
            lengthOfNumber--;
            reverseNumber += (number % 10 ) * (int)(Math.pow(10 , lengthOfNumber));
            number/=10;
        }

        return reverseNumber;
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static int lengOfNumber (int number){
        int lengthOfNumber = 0;
        while (number > 0){
                number/=10;
            lengthOfNumber++;
        }
        return lengthOfNumber;
    }
}
