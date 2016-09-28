package Chapter_5;

/**
 * Created by DWP on 9/28/16.
 */
public class eg_15_ch_5_prime_number {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME = 50;
        final int NUMBER_OF_PER_LINE= 10;
        int count = 0;
        int number = 2;

        System.out.println("The first 50 prime number are \n");
        while(count<NUMBER_OF_PRIME){
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number/2; divisor++){
                if(number % divisor == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                count++;

                if (count % NUMBER_OF_PER_LINE == 0) {
                    System.out.println(number);
                }
                else
                    System.out.print(number +" ");
            }
            number++;
        }
    }
}
