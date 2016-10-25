package Chapter_6;

/**
 * Created by DWP on 10/25/16.
 */
public class ex_13_ch_6_sum_series {
    public static void main(String[] args) {
        printTableSum(1);
    }

    public static void printTableSum(int number){
        System.out.println("i\t\tm(i)");
        System.out.println("-------------");
        double sumSeries = 0;
        for(int i = number; i <= 20; i++){
            sumSeries += sumSeries(i);

            System.out.printf("%d\t\t%.4f\n",i,sumSeries);
        }
    }

    public static double sumSeries(double i){
        double sum = i / (i + 1);
        return sum;
    }
}
