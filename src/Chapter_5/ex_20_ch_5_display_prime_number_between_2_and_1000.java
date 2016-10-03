package Chapter_5;

/**
 * Created by DWP on 10/3/16.
 */
public class ex_20_ch_5_display_prime_number_between_2_and_1000 {
    public static void main(String[] args) {
        final int NUMBER_OF_PRIME = 168;
        final int NUMBER_OF_PER_LINE= 8;
        int count = 0;
        int number = 2;

        System.out.println("Prime number between 2 and 1000 \n");
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
