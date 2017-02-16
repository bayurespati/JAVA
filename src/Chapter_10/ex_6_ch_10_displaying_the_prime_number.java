package Chapter_10;

import Chapter_10.library_class_chapter_10.StackOfInteger;

/**
 * Created by bnamora on 2/16/17.
 */
public class ex_6_ch_10_displaying_the_prime_number {
    public static void main(String[] args) {
        StackOfInteger stack = new StackOfInteger();

        for(int number = 2; number <= 120; number++){
            if(isPrime(number))
                stack.push(number);
        }

        System.out.println("The prime number less then 120 by decreasing order ");
        while (!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static boolean isPrime(int i){
        for (int divisor = 2; divisor <= i/2; divisor++){
            if (i % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
