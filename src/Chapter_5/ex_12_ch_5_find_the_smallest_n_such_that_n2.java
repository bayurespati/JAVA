package Chapter_5;

/**
 * Created by DWP on 9/29/16.
 */
public class ex_12_ch_5_find_the_smallest_n_such_that_n2 {
    public static void main(String[] args) {
        int n = 0;
        while((n*n) < 12000){
            n++;
        }
        System.out.println("Smallest n  is : "+n);
    }
}
