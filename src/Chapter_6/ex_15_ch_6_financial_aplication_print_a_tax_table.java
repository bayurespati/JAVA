package Chapter_6;

/**
 * Created by DWP on 10/26/16.
 */
public class ex_15_ch_6_financial_aplication_print_a_tax_table {
    public static void main(String[] args) {
        printTaxTableIncome(50000);
    }

    public static void printTaxTableIncome(double income){
        System.out.println("Taxable\t\tSingle\t\tMarried Joint\t\tMarried\t\t\tHead of");
        System.out.println("Income\t\t\t\t\tor Qualifying\t\tSeparate\t\ta House");
        System.out.println("\t\t\t\t\t\tWidow(er)");
        System.out.println("---------------------------------------------------------------------");


        for(double i = income; i <= 60000; i +=50){
            System.out.printf("%.0f", i);
            for(int status = 1; status < 5; status++){
                System.out.printf("\t\t\t%.0f", computeTax(status, i));
            }
            System.out.println();
        }
    }

    public static double computeTax(int status, double income){
        double tax = 0;
        if (status == 1) {
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
        }
        if(status == 2){
            tax = 16700 * 0.10 + (income - 16700) * 0.15;
        }
        if(status == 3){
            tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
        }
        if(status == 4){
            tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (income - 45500) * 0.25;
        }
        return tax;
    }
}
