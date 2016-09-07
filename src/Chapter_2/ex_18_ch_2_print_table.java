package Chapter_2;

/**
 * Created by DWP on 9/7/16.
 Write a program that displays the following table. Cast floating- point numbers into integers.



 */
public class ex_18_ch_2_print_table {
    public static void main(String[] args) {


        int a = 1, b= 2;

        System.out.println("a       b       pow(a,b)");
        System.out.println(+a+"       "+b+"       "+(int)Math.pow(a,b));
        System.out.println(+(a++)+"       "+(b++)+"       "+(int)Math.pow(a,b));
        System.out.println(+(a++)+"       "+(b++)+"       "+(int)Math.pow(a,b));
        System.out.println(+(a++)+"       "+(b++)+"       "+(int)Math.pow(a,b));
        System.out.println(+(a++)+"       "+(b++)+"       "+(int)Math.pow(a,b));

    }

}
