package Chapter_5;

/**
 * Created by DWP on 9/27/16.
 */
public class eg_13_ch_5_test_continue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20){
            number++;
            if(number == 10 || number == 11)
                continue;
            sum += number;
        }
        System.out.println("The sum is "+sum);
    }
}
