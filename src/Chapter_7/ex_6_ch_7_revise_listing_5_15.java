package Chapter_7;

/**
 * Created by DWP on 11/24/16.
 */
public class ex_6_ch_7_revise_listing_5_15 {
    public static void main(String[] args) {
        int[] primeNumber = getPrimeNumber();

        printNumber(primeNumber);
    }

    public static int[] getPrimeNumber(){
        int[] numberPrime = new int [50];

        int number = 2;
        int count = 0;

        while (count < numberPrime.length){
            if(isPrime(number)){
                numberPrime[count] = number;
                count++;
            }
            number++;
        }

        return numberPrime;
    }

    public static boolean isPrime(int number){

        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++){
            if(number % divisor == 0){
                return false;
            }
        }

        return true;
    }

    public static void printNumber(int[] number){

        int count = 0;
        for(int i = 0; i < number.length; i++){
            System.out.print(" "+number[i]);
            count++;
            if(count % 10 == 0){
                System.out.println();
            }
        }
    }
}
