package Chapter_4;

import java.util.Scanner;

/**
 * Created by DWP on 9/19/16.
 */
public class ex_17_ch_4_days_of_a_month {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year : ");
        int year = input.nextInt();
        System.out.print("Enter a Month : ");
        String month = input.next();

        String month31Days = "Jan Mar Mei Jul Aug Oct Dec";
        String month30Days = "Apr Jun Sep Nov";
        String month29Days = "Feb";



        System.out.print(month+" "+year+" has");

        if(month31Days.contains(month))
            System.out.print(" 31 ");
        else if(month30Days.contains(month))
            System.out.print(" 30");
        else if (month29Days.contains(month))
            System.out.print(" 29 ");

        System.out.println(" Day ");
    }
}
