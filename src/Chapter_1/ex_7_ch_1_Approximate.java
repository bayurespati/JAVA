package Chapter_1;

/**
 * Created by DWP on 9/5/16.
 Write a program that display the result of 4x(1-1/3+1/5-1/7+1/9-1/11)
 and 4x(1-1/3+1/5-1/7+1/9-1/11+1/13)
 */
public class ex_7_ch_1_Approximate {
    public static void main(String[] args) {
        System.out.print("          1   1   1   1   1\n" );
        System.out.print("4 x ( 1 - - + - - - + - - - )= " + 4*(1-(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))  +"\n");
        System.out.print("          3   5   7   9   11\n");
        System.out.print("\n");
        System.out.print("          1   1   1   1   1   1\n" );
        System.out.print("4 x ( 1 - - + - - - + - - - + - )= " + 4*(1-(1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11) + (1.0/13))  +"\n");
        System.out.print("          3   5   7   9   11  13\n");

    }
}
