package Chapter_9;

import Chapter_9.libaray_class_chapter_9.Stopwatch;

/**
 * Created by bnamora on 2/10/17.
 */
public class ex_6_ch_9_stopwatch {
    public static void main(String[] args) {
        int[] number = randomNumber();

        Stopwatch stopwatch = new Stopwatch();

        stopwatch.start();
        selectionSort(number);
        stopwatch.stop();
        System.out.println("Duration sorting number is : "+stopwatch.getElapsedTime() +" milliseconds");
    }

    public static int[] randomNumber(){
        int[] number = new int[100000];
        for(int i = 0; i < number.length; i++){
            number[i] = (int) (Math.random() * 100000);
        }
        return number;
    }

    public static void selectionSort(int[] number){
        for (int i = 0; i < number.length - 1; i++) {
            int currentMin = number[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < number.length; j++) {
                if (currentMin > number[j]) {
                    currentMin = number[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i){
                number[currentMinIndex] = number[i];
                number[i] = currentMin;
            }
        }
    }
}

