package Chapter_6;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_11_ch_6_financial_application_compute_commissions {
    public static void main(String[] args) {
        printTableCommission(5000);
    }

    public static void printTableCommission(double sales){
        System.out.println("Sales Amount\tCommission");
        System.out.println("---------------------------");

        double totalCommission = 0;

        for(double i = sales ; i <= 100000 ; i += sales) {
            totalCommission = computeCommission(i) + totalCommission;
            if(i >= 10000) {
                System.out.printf("%.0f\t\t\t%.2f\n",i,totalCommission);
            }
        }

    }

    public static double computeCommission(double sales){
        double commission = 0;

        if(sales == 5000){
            commission = 5000 * 0.08;
        }
        else if(sales == 10000){
            commission = 5000 * 0.1;
        }
        else
            commission = 5000 * 0.12;

        return commission;

    }
}
