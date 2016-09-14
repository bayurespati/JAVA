package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/14/16.
 */
public class eg_2_ch_4_order_two_cities {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first city : ");
        String city1 = input.nextLine();
        System.out.print("Enter the Second city : ");
        String city2 = input.nextLine();

        if(city1.compareTo(city2) < 0)
            System.out.print("the cities in alphabetic order are "+city1+" "+city2);
        else
            System.out.print("The cities in alphabetic order are "+city2+" "+city1);
    }
}
