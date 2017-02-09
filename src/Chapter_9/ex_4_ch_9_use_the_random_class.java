package Chapter_9;

import java.util.Random;

/**
 * Created by bnamora on 2/9/17.
 */
public class ex_4_ch_9_use_the_random_class {
    public static void main(String[] args) {
        Random random = new Random(1000);
        for(int i = 0; i < 50; i++){
            System.out.print((i % 10 == 9) ? "\n" : " "+random.nextInt(100));
        }
    }
}

/*
(Use the Random class) Write a program that creates a Random object with seed 1000
and displays the first 50 random integers between 0 and 100 using the nextInt(100) method.
 */