package Chapter_5;

/**
 * Created by DWP on 9/27/16.
 */
public class eg_8_ch_5_test_sum {
    public static void main(String[] args) {
        float sum = 0;

        for(float i = 0.01f; i <= 1.0f; i = i +0.01f)
            sum += i;

        System.out.println("The sum is "+sum);
    }
}
