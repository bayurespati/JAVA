package Chapter_5;

/**
 * Created by DWP on 10/11/16.
 */
public class ex_39_ch_5_financial_application_find_the_sales_amount {
    public static void main(String[] args) {

        double j = 0;
        for(double i = 0.01, k = 1; k < 25000; i += 0.01){

            if(i <=  5000){
                k += (i*0.08);
            }
            else if(i <= 10000 && i > 5000){
                k += i*0.1;
            }
            else
                k += i*0.12;

            j +=i;
        }
        System.out.println(j);
    }
}
