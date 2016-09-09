package Chapter_3;

import java.util.Scanner;

/**
 * Created by DWP on 9/9/16.
 *
 */
public class ex_11_ch_3_find_number_of_days_in_month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month and year : ");
        int month = input.nextInt();
        int year  = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 !=0) || (year % 400 == 0);


        switch (month){
            case 1 : System.out.print("January "+year+" had 30 day");break;
            case 2 : if(isLeapYear){
                        System.out.print("Feb "+year+" had 29 day");
                        }
                     else System.out.print("Feb "+year+" had 28 day");break;
            case 3 : System.out.print("march "+year+" had 30 day");break;
            case 4 : System.out.print("april "+year+" had 31 day");break;
            case 5 : System.out.print("may "+year+" had 30 day");break;
            case 6 : System.out.print("june "+year+" had 31 day");break;
            case 7 : System.out.print("July "+year+" had 30 day");break;
            case 8 : System.out.print("august "+year+" had 31 day");break;
            case 9 : System.out.print("september "+year+" had 30 day");break;
            case 10 : System.out.print("october "+year+" had 31 day");break;
            case 11 : System.out.print("november "+year+" had 30 day");break;
            case 12 : System.out.print("december "+year+" had 31 day");

        }
    }


}
