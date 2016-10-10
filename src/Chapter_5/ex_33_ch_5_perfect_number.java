package Chapter_5;

/**
 * Created by DWP on 10/10/16.
 */
public class ex_33_ch_5_perfect_number {
    public static void main(String[] args) {


        for(int i = 1; i <= 10000; i++){
            int m = 0;
            for(int k = 1; k < i; k++){

                if(i % k == 0){
                    m +=k;
                }

            }
            if(i == m) {
                System.out.println(i);
            }
        }
    }
}
