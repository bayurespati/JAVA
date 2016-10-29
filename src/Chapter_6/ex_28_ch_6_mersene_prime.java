package Chapter_6;

/**
 * Created by DWP on 10/29/16.
 */
public class ex_28_ch_6_mersene_prime {
    public static void main(String[] args) {
        printMersennePrime(2);
    }

    public static void printMersennePrime(int number){
        System.out.println("p\t\t2^p-1");
        System.out.println("---------------");
        for(int i = number; i <= 31; i++){
            if(isPrime(i)){
                System.out.printf("%d\t\t",i);
                int merrinePrime = ((int) (Math.pow(2,i)))-1;
                System.out.println(merrinePrime);
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
