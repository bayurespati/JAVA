package Chapter_5;

/**
 * Created by DWP on 9/27/16.
 */
public class eg_12_ch_5_test_break {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number < 20){
            number ++;
            sum += number;
            if(sum >= 100)
                break;

        }
        System.out.println("The number is "+number);
        System.out.println("The number is "+sum);
    }
}
