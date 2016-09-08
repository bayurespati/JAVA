package Chapter_3;


import java.util.Scanner;

/**
 * Created by DWP on 9/8/16.


 */
public class eg_2_ch_3_simple_if_demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number =input.nextInt();

        if (number % 5 == 0)
            System.out.println("HiFive");

        if (number % 2 == 0)
            System.out.println("HiEven");
    }
}
