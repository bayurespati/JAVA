package Chapter_6;

/**
 * Created by DWP on 10/14/16.
 */
public class eg_4_ch_6_Increment {
    public static void main(String[] args) {
        int x =1;
        System.out.println("Before the call, x is "+x);
        increment(x);
        System.out.println("After the call, x is "+x);
    }
    public static void increment(int n){
        n++;
        System.out.println("n inside the method is "+n);
    }
}
