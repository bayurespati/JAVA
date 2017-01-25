package Chapter_8;

import java.util.Scanner;

/**
 * Created by bnamora on 1/25/17.
 */
public class ex_12_ch_8_financial_application_compute_tax {
    public static void main(String[] args) {
        int status = getStatus();
        int income = getIncome();
        double[] rate = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets= {
                {8350, 33950, 82250, 171550, 372950},
                {16700, 67900, 137050, 20885, 372950},
                {8350, 33950, 68525, 104425, 186475},
                {11950, 45500, 117450, 190200, 372950}
        };

        double tax = getTax(status,income,rate,brackets);

        System.out.println("The tax is : "+tax);
    }

    public static int getStatus(){
        Scanner input = new Scanner(System.in);
        System.out.print("0 = single filer, \n1 = married jointly or qualifying widow(er),\n2 = married separately,\n3 = head of household)\nEnter the filing status : ");
        return input.nextInt();
    }

    public static int getIncome(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the taxable Income : ");
        return input.nextInt();
    }

    public static double getTax(int status, int income, double[] rate, int[][] brackets){
        int limitIteration = getLimitFromIncome(income);
        return getTaxForEachStatus(income,rate,brackets,limitIteration,status);

    }

    public static double getTaxForEachStatus(int income,double[] rate, int[][] brackets,int limitIteration,int status){
        double tax = 0;
        for(int i = 0; i < limitIteration; i++){
            if( i == 0) {
                tax += brackets[status][i] * rate[i];
            }else
                tax += (brackets[status][i] - brackets[status][i-1]) * rate[i];
        }
            tax += ((income - brackets[status][limitIteration-1]) * rate[limitIteration]);

        return tax;
    }

    public static int getLimitFromIncome(int income){
        int limitIteration;
        if(income <= 8350){
            limitIteration = 0;
        }else if(income <= 33950){
            limitIteration = 1;
        } else if(income <= 82250){
            limitIteration = 2;
        } else if(income <= 171550){
            limitIteration = 3;
        }else if(income <= 372950){
            limitIteration = 4;
        }else {
            limitIteration = 5;
        }
        return limitIteration;
    }
}

