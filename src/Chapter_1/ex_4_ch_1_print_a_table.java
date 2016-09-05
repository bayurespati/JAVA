package Chapter_1;

/**
 * Created by DWP on 9/5/16.
 * (Print a table) Write a program that displays the following table:
 a a^2 a^3 111 248
 3 9 27 4 16 64
 */
public class ex_4_ch_1_print_a_table {
    public static void main(String[] args) {
        System.out.print("a      a^2      a^3\n");
        System.out.print("1      "+(1 *1)+"        " + (1*1*1) +"\n");
        System.out.print("2      "+(2 *2)+"        " + (2*2*2) +"\n");
        System.out.print("3      "+(3 *3)+"        " + (3*3*3) +"\n");
        System.out.print("4      "+(4 *4)+"       " + (4*4*4) +"\n");
    }
}
