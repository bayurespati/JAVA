package Chapter_5;

/**
 * Created by DWP on 9/29/16.
 */
public class ex_13_eg_5_find_the_largest_n_such_that_n3_12000 {
    public static void main(String[] args) {
        int n = 0;

        while(Math.pow(n,3) < 12000){
            n++;
        }
        System.out.println("Largest N is : "+(--n));
    }
}
