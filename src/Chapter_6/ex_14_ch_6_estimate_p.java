package Chapter_6;

/**
 * Created by DWP on 10/26/16.
 */
public class ex_14_ch_6_estimate_p {
   public static void main(String[] args) {
        printTableP(1);
    }

    public static void printTableP(double p) {
        System.out.println("i\t\tm(i)");
        System.out.println("-----------------");
        for (double i = p; i <= 901; i += 100) {
            double totalP = 0;
            for (double k = i; k >= 2; k--) {
                totalP += computeP(i);
            }
            double estimationP = (totalP + 1) * 4;
            System.out.printf("%.0f\t\t%.4f\n", i, estimationP);
        }
    }

    public static double computeP(double p){
        double result = Math.pow(-1, (p + 1)) / ((2 * p) - 1);
        return result;
    }
}
