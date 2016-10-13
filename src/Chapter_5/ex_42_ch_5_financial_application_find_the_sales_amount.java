package Chapter_5;

import java.util.Scanner;

/**
 * Created by DWP on 10/13/16.
 */
public class ex_42_ch_5_financial_application_find_the_sales_amount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter commission sought = ");
        int commission = input.nextInt();

        double k = 0;
        double i = 0.01;
        double j = 0;
        do{
            if(i <=  5000){
                k += (i*0.08);
            }
            else if(i <= 10000 && i > 5000){
                k += i*0.1;
            }
            else
                k += i*0.12;

            j +=i;
            i += 0.01;
        }while (k < commission);

        System.out.println(j);
    }
}
