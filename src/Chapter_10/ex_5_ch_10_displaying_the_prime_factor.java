package Chapter_10;

import Chapter_10.library_class_chapter_10.StackOfInteger;

import java.util.Scanner;

/**
 * Created by bnamora on 2/16/17.
 */
public class ex_5_ch_10_displaying_the_prime_factor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackOfInteger stack = new StackOfInteger();

        System.out.print("Input Positive Integer : ");
        int number = input.nextInt();
        int factor = 2;

        while (number > 1){
            if (number % factor == 0){
                stack.push(factor);
                number /= factor;
            }else
                factor++;
        }

        while (!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
    }
}
